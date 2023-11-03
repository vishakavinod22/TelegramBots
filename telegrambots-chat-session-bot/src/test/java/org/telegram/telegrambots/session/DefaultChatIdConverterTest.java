package org.telegram.telegrambots.session;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.session.Session;

import java.io.Serializable;

import static org.junit.jupiter.api.Assertions.*;

public class DefaultChatIdConverterTest {

    @Test
    void testDefaultConstructor(){
        DefaultChatIdConverter defaultChatIdConverter = new DefaultChatIdConverter();
        System.out.println(defaultChatIdConverter);
    }

}
