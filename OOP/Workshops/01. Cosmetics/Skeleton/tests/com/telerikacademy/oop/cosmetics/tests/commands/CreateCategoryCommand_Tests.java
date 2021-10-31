package com.telerikacademy.oop.cosmetics.tests.commands;

import com.telerikacademy.oop.cosmetics.commands.CreateCategoryCommand;
import com.telerikacademy.oop.cosmetics.commands.contracts.Command;
import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.tests.utils.TestData;
import com.telerikacademy.oop.cosmetics.tests.utils.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

public class CreateCategoryCommand_Tests {

    private Command command;
    private CosmeticsRepository repository;

    @BeforeEach
    void setUp() {
        repository = TestUtilities.initializeRepository();
        command = new CreateCategoryCommand(repository);
    }

    @ParameterizedTest(name = "with size {0}")
    @ValueSource(ints = {CreateCategoryCommand.EXPECTED_NUMBER_OF_ARGUMENTS - 1, CreateCategoryCommand.EXPECTED_NUMBER_OF_ARGUMENTS + 1})
    public void should_throwException_when_argumentCountDifferentThanExpected(int testSize) {
        // Arrange, Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> command.execute(TestUtilities.initializeListWithSize(testSize)));
    }

    @Test
    public void should_throwException_when_categoryWithSameNameExists() {
        // Arrange
        command.execute(List.of(TestData.CategoryData.VALID_NAME));

        // Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> command.execute(List.of(TestData.CategoryData.VALID_NAME)));
    }

    @Test
    public void should_create_when_requirementsAreSatisfied() {
        // Arrange
        command.execute(List.of(TestData.CategoryData.VALID_NAME));

        // Act, Assert
        Assertions.assertEquals(1, repository.getCategories().size());
    }
}
