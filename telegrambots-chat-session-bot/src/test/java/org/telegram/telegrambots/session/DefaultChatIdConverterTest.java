package org.telegram.telegrambots.session;

import org.apache.shiro.session.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.*;

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
    void testPositive_setSessionId() {
        long sessionId = 12345;
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter();
        defaultChatIdConverter.setSessionId(sessionId);
        assertEquals(defaultChatIdConverter.getSessionId(), sessionId);
    }

    @Test
    /*
      Tests the negative scenario for setSessionId() method of DefaultChatIdConverter.
      It sets a dummy value for sessionID with wrong datatype, then verifies if setSessionId() throws the ClassCastException exception [8].
     */
    void testNegative_setSessionId() {
        int sessionId = 12345;
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter();
        assertThrows(ClassCastException.class, () -> defaultChatIdConverter.setSessionId(sessionId));
    }

    @Test
    /*
      Tests the generateId() method of DefaultChatIdConverter.
      It sets a dummy value for sessionID, then verifies if generateId() generates the expected value [8].
     */
    void testPositive_generateId() {
        long sessionId = 12345;
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter();
        defaultChatIdConverter.setSessionId(sessionId);

        // Session is being mocked as it is an external dependency [9]
        Session session = Mockito.mock(Session.class);

        Serializable generatedId = defaultChatIdConverter.generateId(session);
        assertEquals(generatedId, sessionId);
    }

    @Test
    void testNegative_generateId() {
        long sessionId = 12345;
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter();
        defaultChatIdConverter.setSessionId(sessionId);

        // Session is being mocked as it is an external dependency [9]
        Session session = Mockito.mock(Session.class);

        Serializable generatedId = defaultChatIdConverter.generateId(session);
        assertNotEquals(generatedId, "1234");
    }

}
