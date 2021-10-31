package com.telerikacademy.oop.cosmetics.core.contracts;

import com.telerikacademy.oop.cosmetics.commands.contracts.Command;

public interface CommandFactory {

    Command createCommandFromCommandName(String commandName, CosmeticsRepository repository);

}
