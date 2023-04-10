package ru.ezuykow.europeanpark.managers;

import org.springframework.stereotype.Component;
import ru.ezuykow.europeanpark.commands.CommandManager;
import ru.ezuykow.europeanpark.models.ExtendedUpdate;

/**
 * @author ezuykow
 */
@Component
public class UpdateManager {

    public enum UpdateType {
        COMMAND,
        SIMPLE_MESSAGE,
        UNKNOWN
    }

    private final CommandManager commandManager;

    public UpdateManager(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    public void performUpdate(ExtendedUpdate update) {
        switch (getUpdateType(update)) {
            case COMMAND -> commandManager.performCommand(update);
            case SIMPLE_MESSAGE -> {}//TODO;
        }
    }

    private UpdateType getUpdateType(ExtendedUpdate update) {
        if (update.hasMessageText()) {
            if (update.isCommand()) {
                return UpdateType.COMMAND;
            }
            return UpdateType.SIMPLE_MESSAGE;
        }
        //TODO Если нет текста
        return UpdateType.UNKNOWN;
    }
}
