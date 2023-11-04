package org.telegram.telegrambots.session;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class DefaultChatSessionContextTest {

    @Test
    /*
      Tests the getSessionId() method of DefaultChatSessionContext.
      It sets a dummy value for sessionID, then verifies if the value received by getSessionId() matches the expected value [8].
     */
    void test_getSessionId(){
        long sessionId = 12345;
        String host = "host";
        DefaultChatSessionContext defaultChatSessionContext = new DefaultChatSessionContext(sessionId, host);
        assertEquals(defaultChatSessionContext.getSessionId(), sessionId);
    }

    @Test
    /*
      Tests the positive scenario for setSessionId() method of DefaultChatSessionContext.
      It sets a dummy value for sessionID, then verifies if the value set by setSessionId() matches the expected value [8].
     */
    void positiveTest_setSessionId() {
        long sessionId = 12345;
        String host = "host";
        DefaultChatSessionContext defaultChatSessionContext = new DefaultChatSessionContext(sessionId, host);
        defaultChatSessionContext.setSessionId(sessionId);
        assertEquals(defaultChatSessionContext.getSessionId(), sessionId);
    }

    @Test
    /*
      Tests the negative scenario for setSessionId() method of DefaultChatSessionContext.
      It sets a dummy value for sessionID with wrong datatype, then verifies if setSessionId() throws the ClassCastException exception [8].
     */
    void negativeTest_setSessionId() {
        int sessionId = 12345;
        String host = "host";
        DefaultChatSessionContext defaultChatSessionContext = new DefaultChatSessionContext(sessionId, host);
        assertThrows(ClassCastException.class, () -> defaultChatSessionContext.setSessionId(sessionId));
    }

}
