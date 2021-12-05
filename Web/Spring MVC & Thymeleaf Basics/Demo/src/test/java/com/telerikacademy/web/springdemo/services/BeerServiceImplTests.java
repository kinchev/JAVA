package com.telerikacademy.web.springdemo.services;

import com.telerikacademy.web.springdemo.exceptions.DuplicateEntityException;
import com.telerikacademy.web.springdemo.exceptions.EntityNotFoundException;
import com.telerikacademy.web.springdemo.exceptions.UnauthorizedOperationException;
import com.telerikacademy.web.springdemo.models.Beer;
import com.telerikacademy.web.springdemo.models.User;
import com.telerikacademy.web.springdemo.repositories.BeerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Optional;

import static com.telerikacademy.web.springdemo.Helpers.*;

@ExtendWith(MockitoExtension.class)
public class BeerServiceImplTests {

    @Mock
    BeerRepository mockRepository;

    @InjectMocks
    BeerServiceImpl service;

    @Test
    void getAll_should_callRepository() {
        // Arrange
        Mockito.when(mockRepository.getAll())
                .thenReturn(new ArrayList<>());

        // Act
        service.getAll();

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .getAll();
    }

    @Test
    void filter_should_callRepository() {
        // Arrange
        Mockito.when(mockRepository.filter(Optional.empty()))
                .thenReturn(new ArrayList<>());

        // Act
        service.filter(Optional.empty());

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .filter(Optional.empty());
    }

    @Test
    public void getById_should_returnBeer_when_matchExist() {
        // Arrange
        Beer mockBeer = createMockBeer();
        Mockito.when(mockRepository.getById(mockBeer.getId()))
                .thenReturn(mockBeer);
        // Act
        Beer result = service.getById(mockBeer.getId());

        // Assert
        Assertions.assertAll(
                () -> Assertions.assertEquals(mockBeer.getId(), result.getId()),
                () -> Assertions.assertEquals(mockBeer.getName(), result.getName()),
                () -> Assertions.assertEquals(mockBeer.getAbv(), result.getAbv())
        );
    }

    @Test
    public void create_should_throw_when_beerWithSameNameExists() {
        // Arrange
        Beer mockBeer = createMockBeer();

        Mockito.when(mockRepository.getByName(mockBeer.getName()))
                .thenReturn(mockBeer);

        // Act, Assert
        Assertions.assertThrows(DuplicateEntityException.class, () -> service.create(mockBeer));
    }

    @Test
    public void create_should_callRepository_when_beerWithSameNameDoesNotExist() {
        // Arrange
        Beer mockBeer = createMockBeer();

        Mockito.when(mockRepository.getByName(mockBeer.getName()))
                .thenThrow(EntityNotFoundException.class);

        // Act
        service.create(mockBeer);

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .create(mockBeer);
    }

    @Test
    public void update_should_throwException_when_userIsNotCreatorOrAdmin() {
        // Arrange
        Beer mockBeer = createMockBeer();
        User mockInitiator = createMockUser();
        User mockCreator = new User("MockUser2");
        mockBeer.setCreatedBy(mockCreator);

        Mockito.when(mockRepository.getById(Mockito.anyInt()))
                .thenReturn(mockBeer);

        // Act, Assert
        Assertions.assertThrows(UnauthorizedOperationException.class,
                () -> service.update(mockBeer, mockInitiator));
    }

    @Test
    void update_should_callRepository_when_userIsCreatorAndIsNotAdmin() {
        // Arrange
        Beer mockBeer = createMockBeer();
        User mockUser = createMockUser();
        mockBeer.setCreatedBy(mockUser);

        Mockito.when(mockRepository.getById(Mockito.anyInt()))
                .thenReturn(mockBeer);

        Mockito.when(mockRepository.getByName(Mockito.anyString()))
                .thenThrow(EntityNotFoundException.class);

        // Act
        service.update(mockBeer, mockUser);

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .update(mockBeer);
    }

    @Test
    void update_should_callRepository_when_userIsNotCreatorAndIsAdmin() {
        // Arrange
        Beer mockBeer = createMockBeer();
        User mockInitiator = createMockAdmin();
        mockInitiator.setUsername("MockInitiator");
        mockBeer.setCreatedBy(mockInitiator);

        Mockito.when(mockRepository.getById(Mockito.anyInt()))
                .thenReturn(mockBeer);

        Mockito.when(mockRepository.getByName(Mockito.anyString()))
                .thenThrow(EntityNotFoundException.class);

        // Act
        service.update(mockBeer, mockInitiator);

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .update(mockBeer);
    }

    @Test
    public void update_should_throwException_when_beerNameIsTaken() {
        // Arrange
        Beer mockBeer = createMockBeer();
        mockBeer.setName("test-name");
        Beer anotherMockBeer = createMockBeer();
        anotherMockBeer.setId(2);
        anotherMockBeer.setName("test-name");

        Mockito.when(mockRepository.getById(Mockito.anyInt()))
                .thenReturn(mockBeer);

        Mockito.when(mockRepository.getByName(Mockito.anyString()))
                .thenReturn(anotherMockBeer);

        // Act, Assert
        Assertions.assertThrows(DuplicateEntityException.class,
                () -> service.update(mockBeer, createMockUser()));
    }

    @Test
    public void update_should_callRepository_when_tryingToUpdateExistingBeer() {
        // Arrange
        Beer mockBeer = createMockBeer();

        Mockito.when(mockRepository.getById(Mockito.anyInt()))
                .thenReturn(mockBeer);

        Mockito.when(mockRepository.getByName(Mockito.anyString()))
                .thenReturn(mockBeer);


        // Act
        service.update(mockBeer, mockBeer.getCreatedBy());

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .update(mockBeer);
    }

    @Test
    void delete_should_throwException_when_initiatorIsNotAdminOrCreator() {
        // Arrange
        Beer mockBeer = createMockBeer();
        User mockInitiator = createMockUser();
        mockInitiator.setUsername("MockInitiator");

        Mockito.when(mockRepository.getById(mockBeer.getId()))
                .thenReturn(mockBeer);

        // Act, Assert
        Assertions.assertThrows(UnauthorizedOperationException.class,
                () -> service.delete(mockBeer.getId(), mockInitiator));
    }

    @Test
    void delete_should_callRepository_when_initiatorIsAdminAndIsNotCreator() {
        // Arrange
        Beer mockBeer = createMockBeer();
        User mockInitiator = createMockAdmin();
        mockInitiator.setUsername("MockInitiator");

        Mockito.when(mockRepository.getById(mockBeer.getId()))
                .thenReturn(mockBeer);

        // Act
        service.delete(mockBeer.getId(), mockInitiator);

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .delete(mockBeer.getId());
    }

    @Test
    void delete_should_callRepository_when_initiatorIsNotAdminAndIsCreator() {
        // Arrange
        Beer mockBeer = createMockBeer();

        Mockito.when(mockRepository.getById(mockBeer.getId()))
                .thenReturn(mockBeer);

        // Act
        service.delete(mockBeer.getId(), mockBeer.getCreatedBy());

        // Assert
        Mockito.verify(mockRepository, Mockito.times(1))
                .delete(mockBeer.getId());
    }
}
