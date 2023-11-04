package org.telegram.telegrambots.session;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DefaultChatIdConverterTest {

    @Test
    /*
      Tests the getSessionId() method of DefaultChatIdConverter.
      It sets a dummy value for sessionID, then verifies if the value received by getSessionId() matches the expected value [8].
     */
    void test_getSessionId(){
        long sessionId = 12345;
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter(sessionId);
        assertEquals(defaultChatIdConverter.getSessionId(), sessionId);
    }

    @Test
    /*
      Tests the positive scenario for setSessionId() method of DefaultChatIdConverter.
      It sets a dummy value for sessionID, then verifies if the value set by setSessionId() matches the expected value [8].
     */
    void positiveTest_setSessionId() {
        long sessionId = 12345;
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter();
        defaultChatIdConverter.setSessionId(sessionId);
        assertEquals(defaultChatIdConverter.getSessionId(), sessionId);
    }

}
