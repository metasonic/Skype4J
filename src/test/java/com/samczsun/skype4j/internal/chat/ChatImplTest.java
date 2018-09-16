package com.samczsun.skype4j.internal.chat;

import com.samczsun.skype4j.LiveLoginSkypeBuilder;
import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.chat.messages.ChatMessage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertFalse;

public class ChatImplTest {
    private static final Logger logger = Logger.getLogger(Skype.class.getCanonicalName());
    Skype skype = new LiveLoginSkypeBuilder("a.semennikov@argustelecom.ru", "HellSkype3Bot").withAllResources()
            .withLogger(logger).build();

    @Before
    public void setUp() throws Exception {
        skype.login();
    }

    @After
    public void tearDown() throws Exception {
        skype.logout();
    }

    @Test
    public void loadMoreMessages() throws Exception {
        Chat chat = skype.getOrLoadChat("8:alexey.semennikov");
        List<ChatMessage> messages = chat.loadMoreMessages(10);
        // in order to test this, send new message from this chat.
        chat.sendMessage("testing messages 1");
        List<ChatMessage> nextMessages = chat.loadMoreMessages(10);
        assertFalse(messages.isEmpty());
        assertFalse(nextMessages.isEmpty());
        // assertThat(messages.size(), equalTo(2));
        // assertThat(nextMessages.size(), equalTo(1));
    }

}