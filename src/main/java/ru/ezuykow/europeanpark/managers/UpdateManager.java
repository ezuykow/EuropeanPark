package ru.ezuykow.europeanpark.managers;

import org.springframework.stereotype.Component;
import ru.ezuykow.europeanpark.models.ExtendedUpdate;

/**
 * @author ezuykow
 */
@Component
public class UpdateManager {

    public void performUpdate(ExtendedUpdate update) {
        if (update.hasMessageText()) {
            performUpdateWithMessageText(update);
        }
        //TODO Если нет текста
    }

    private void performUpdateWithMessageText(ExtendedUpdate update) {
        if (update.isCommand()) {

        }
        //TODO Если не команда
    }
}
