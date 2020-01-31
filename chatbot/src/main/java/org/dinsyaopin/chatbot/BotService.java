package org.dinsyaopin.chatbot;

import org.dinsyaopin.chatbot.model.Message;

public class BotService {

    private static BotService INSTANCE;
    private BotRepository botRepository = BotRepository.getInstance();

    private BotService() {

    }

    public static BotService getInstance() {
        if (INSTANCE == null) {
            synchronized (BotService.class) {
                if (INSTANCE == null) {
                    INSTANCE = new BotService();
                }
            }
        }
        return INSTANCE;
    }

    public String getLink(Message message) {
        return botRepository.getLink(message);
    }
}
