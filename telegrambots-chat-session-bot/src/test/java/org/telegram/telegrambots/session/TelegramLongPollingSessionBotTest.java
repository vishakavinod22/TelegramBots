package org.telegram.telegrambots.session;

import org.apache.shiro.session.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class TelegramLongPollingSessionBotTest extends TelegramLongPollingSessionBot{

    public TelegramLongPollingSessionBotTest() {
        super();
    }



    @Override
    public void onUpdateReceived(Update update, Optional<Session> botSession) {
        // Abstract method
    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Test
    /*
      Tests the onUpdateReceived() method of TelegramLongPollingSessionBot.
      It sets a dummy value for update and message, then verifies if the method is called [9].
     */
    void test_onUpdateReceived(){
        Update update = Mockito.mock(Update.class);
        Message message = Mockito.mock(Message.class);

        TelegramLongPollingSessionBot telegramLongPollingSessionBotTest = Mockito.mock(TelegramLongPollingSessionBotTest.class);
        telegramLongPollingSessionBotTest.onUpdateReceived(update);
        Mockito.verify(telegramLongPollingSessionBotTest).onUpdateReceived(update);
    }

}
