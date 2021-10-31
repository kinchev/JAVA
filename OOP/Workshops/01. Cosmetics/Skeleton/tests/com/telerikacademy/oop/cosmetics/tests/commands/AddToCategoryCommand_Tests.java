package com.telerikacademy.oop.cosmetics.tests.commands;

import com.telerikacademy.oop.cosmetics.commands.AddToCategoryCommand;
import com.telerikacademy.oop.cosmetics.commands.contracts.Command;
import com.telerikacademy.oop.cosmetics.tests.utils.TestUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class AddToCategoryCommand_Tests {
    @ParameterizedTest(name = "with size {0}")
    @ValueSource(ints = {AddToCategoryCommand.EXPECTED_NUMBER_OF_ARGUMENTS - 1, AddToCategoryCommand.EXPECTED_NUMBER_OF_ARGUMENTS + 1})
    public void should_throwException_when_argumentCountDifferentThanExpected(int testSize) {
        // Arrange
        Command command = new AddToCategoryCommand(TestUtilities.initializeRepository());

        // Act, Assert
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> command.execute(TestUtilities.initializeListWithSize(testSize)));
    }
}
