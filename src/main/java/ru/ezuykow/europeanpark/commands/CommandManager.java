package ru.ezuykow.europeanpark.commands;

import org.springframework.stereotype.Component;
import ru.ezuykow.europeanpark.models.ExtendedUpdate;

/**
 * @author ezuykow
 */
@Component
public class CommandManager {

    private final CommandsActions commandsActions;

    public CommandManager(CommandsActions commandsActions) {
        this.commandsActions = commandsActions;
    }

    public enum Command {
        START,
        UNKNOWN
    }

    public void performCommand(ExtendedUpdate update) {
        switch (getCommandFromText(update)) {
            case START -> commandsActions.performStartCommand(update);
            case UNKNOWN -> {} //TODO msgSender.unknownCommand()
        }
    }

    private Command getCommandFromText(ExtendedUpdate update) {
        final String textCmd = update.message().text().substring(1).toUpperCase();
        try {
            return Command.valueOf(textCmd);
        } catch (IllegalArgumentException e) {
            return Command.UNKNOWN;
        }
    }
}
