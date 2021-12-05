package com.telerikacademy.web.springdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.telerikacademy.web.springdemo.models.*;

import java.util.Set;

public class Helpers {

    public static User createMockUser() {
        return createMockUser("User");
    }

    public static User createMockAdmin() {
        return createMockUser("Admin");
    }

    private static User createMockUser(String role) {
        var mockUser = new User();
        mockUser.setId(1);
        mockUser.setEmail("mock@user.com");
        mockUser.setUsername("MockUsername");
        mockUser.setLastName("MockLastName");
        mockUser.setPassword("MockPassword");
        mockUser.setFirstName("MockFirstName");
        mockUser.setRoles(Set.of(createMockRole(role)));
        return mockUser;
    }

    public static Beer createMockBeer() {
        var mockBeer = new Beer();
        mockBeer.setId(1);
        mockBeer.setName("TestBeer");
        mockBeer.setCreatedBy(createMockUser());
        mockBeer.setStyle(createMockStyle());
        return mockBeer;
    }

    public static Role createMockRole(String role) {
        var mockRole = new Role();
        mockRole.setId(1);
        mockRole.setName(role);
        return mockRole;
    }

    public static Style createMockStyle() {
        var mockStyle = new Style();
        mockStyle.setId(1);
        mockStyle.setName("Ale");
        return mockStyle;
    }

    public static BeerDto createValidBeerDto() {
        BeerDto dto = new BeerDto();
        dto.setStyleId(1);
        dto.setName("valid-name");
        dto.setAbv(2.2);
        return dto;
    }

    /**
     * Accepts an object and returns the stringified object.
     * Useful when you need to pass a body to a HTTP request.
     */
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
