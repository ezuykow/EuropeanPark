package ru.ezuykow.europeanpark.listeners;

import com.pengrad.telegrambot.model.Update;
import org.springframework.stereotype.Service;
import ru.ezuykow.europeanpark.managers.UpdateManager;

import java.util.List;

/**
 * @author ezuykow
 */
@Service
public class UpdatesListener implements com.pengrad.telegrambot.UpdatesListener {

    private final UpdateManager updateManager;

    public UpdatesListener(UpdateManager updateManager) {
        this.updateManager = updateManager;
    }

    @Override
    public int process(List<Update> updates) {
        updates.forEach(updateManager::performUpdate);
        return com.pengrad.telegrambot.UpdatesListener.CONFIRMED_UPDATES_ALL;
    }
}