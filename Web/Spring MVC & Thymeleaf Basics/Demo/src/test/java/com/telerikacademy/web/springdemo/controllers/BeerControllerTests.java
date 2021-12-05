package com.telerikacademy.web.springdemo.controllers;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.exceptions.UnauthorizedOperationException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.BeerDto;
import com.telerikacademy.web.springdemo.models.User;
import com.telerikacademy.web.springdemo.services.BeerService;
import com.telerikacademy.web.springdemo.services.ModelMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static com.telerikacademy.web.springdemo.Helpers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class BeerControllerTests {

    @MockBean
    BeerService mockBeerService;

    @MockBean
    ModelMapper mockModelMapper;

    @MockBean
    AuthenticationHelper mockAuthenticationHelper;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void getById_should_return_statusOK_when_beerExists() throws Exception {
        // Arrange
        Beer mockBeer = createMockBeer();
        Mockito.when(mockBeerService.getById(1))
                .thenReturn(mockBeer);

        // Act, Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/api/beers/{id}", 1))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(mockBeer.getName()));
    }

    @Test
    public void getById_should_return_statusNotFound_when_beerDoesntExist() throws Exception {
        // Arrange
        Mockito.when(mockBeerService.getById(Mockito.anyInt()))
                .thenThrow(EntityNotFoundException.class);

        // Act, Assert
        mockMvc.perform(MockMvcRequestBuilders.get("/api/beers/{id}", 1))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void create_should_return_statusUnauthorized_whenAuthorizationHeaderIsMissing() throws Exception {
        // Arrange
        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenCallRealMethod();

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/beers")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(createValidBeerDto())))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    public void create_should_return_statusNotFound_whenStyleNotFound() throws Exception {
        // Arrange
        User mockUser = createMockUser();
        BeerDto dto = createValidBeerDto();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.when(mockModelMapper.fromDto(Mockito.any(), Mockito.any()))
                .thenThrow(EntityNotFoundException.class);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/beers")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(dto)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void create_should_return_statusConflict_whenBeerWithSameNameExists() throws Exception {
        // Arrange
        User mockUser = createMockUser();
        Beer mockBeer = createMockBeer();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.when(mockModelMapper.fromDto(Mockito.any(), Mockito.any()))
                .thenReturn(mockBeer);

        Mockito.doThrow(DuplicateEntityException.class).when(mockBeerService).create(mockBeer);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/beers")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(createValidBeerDto())))
                .andExpect(MockMvcResultMatchers.status().isConflict());
    }

    @Test
    public void update_should_return_statusNotFound_whenBeerWithGivenIdDoesNotExist() throws Exception {
        // Arrange
        int idOfBeerToUpdate = 1;
        User mockUser = createMockUser();
        BeerDto mockDto = createValidBeerDto();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.when(mockModelMapper.fromDto(Mockito.any(BeerDto.class), Mockito.anyInt()))
                .thenThrow(EntityNotFoundException.class);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.put("/api/beers/{id}", idOfBeerToUpdate)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(mockDto)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @Test
    public void update_should_return_statusConflict_whenBeerWithSameNameExists() throws Exception {
        // Arrange
        int idOfBeerToUpdate = 1;
        User mockUser = createMockUser();
        Beer mockBeer = createMockBeer();
        BeerDto mockDto = createValidBeerDto();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.when(mockModelMapper.fromDto(Mockito.any(BeerDto.class), Mockito.anyInt()))
                .thenReturn(mockBeer);

        Mockito.doThrow(DuplicateEntityException.class).when(mockBeerService).update(mockBeer, mockUser);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.put("/api/beers/{id}", idOfBeerToUpdate)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(mockDto)))
                .andExpect(MockMvcResultMatchers.status().isConflict());
    }

    @Test
    public void update_should_return_statusUnauthorized_whenUserIsNotAuthorizedToEdit() throws Exception {
        // Arrange
        int idOfBeerToUpdate = 1;
        User mockUser = createMockUser();
        Beer mockBeer = createMockBeer();
        BeerDto mockDto = createValidBeerDto();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.when(mockModelMapper.fromDto(Mockito.any(BeerDto.class), Mockito.anyInt()))
                .thenReturn(mockBeer);

        Mockito.doThrow(UnauthorizedOperationException.class)
                .when(mockBeerService)
                .update(mockBeer, mockUser);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.put("/api/beers/{id}", idOfBeerToUpdate)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(mockDto)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    public void delete_should_return_statusUnauthorized_whenUserIsNotAuthorizedToEdit() throws Exception {
        // Arrange
        int idOfBeerToDelete = 1;
        User mockUser = createMockUser();
        BeerDto mockDto = createValidBeerDto();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.doThrow(UnauthorizedOperationException.class)
                .when(mockBeerService)
                .delete(idOfBeerToDelete, mockUser);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.delete("/api/beers/{id}", idOfBeerToDelete)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(mockDto)))
                .andExpect(MockMvcResultMatchers.status().isUnauthorized());
    }

    @Test
    public void delete_should_return_statusNotFound_whenBeerWithGivenIdDoesNotExist() throws Exception {
        // Arrange
        int idOfBeerToDelete = 1;
        User mockUser = createMockUser();
        BeerDto mockDto = createValidBeerDto();

        Mockito.when(mockAuthenticationHelper.tryGetUser(Mockito.any(HttpHeaders.class)))
                .thenReturn(mockUser);

        Mockito.doThrow(EntityNotFoundException.class)
                .when(mockBeerService)
                .delete(idOfBeerToDelete, mockUser);

        // Act, Assert
        mockMvc.perform(
                MockMvcRequestBuilders.delete("/api/beers/{id}", idOfBeerToDelete)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(asJsonString(mockDto)))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

}
