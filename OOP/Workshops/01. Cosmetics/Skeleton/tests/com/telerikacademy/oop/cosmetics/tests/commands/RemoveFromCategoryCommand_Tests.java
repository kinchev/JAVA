package com.telerikacademy.oop.cosmetics.tests.commands;

import com.telerikacademy.oop.cosmetics.commands.RemoveFromCategoryCommand;
import com.telerikacademy.oop.cosmetics.commands.contracts.Command;
import com.telerikacademy.oop.cosmetics.tests.utils.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RemoveFromCategoryCommand_Tests {
    @ParameterizedTest(name = "with size {0}")
    @ValueSource(ints = {RemoveFromCategoryCommand.EXPECTED_NUMBER_OF_ARGUMENTS - 1, RemoveFromCategoryCommand.EXPECTED_NUMBER_OF_ARGUMENTS + 1})
    public void should_throwException_when_argumentCountDifferentThanExpected(int testSize) {
        // Arrange
        Command command = new RemoveFromCategoryCommand(TestUtilities.initializeRepository());

        // Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> command.execute(TestUtilities.initializeListWithSize(testSize)));
    }
}
