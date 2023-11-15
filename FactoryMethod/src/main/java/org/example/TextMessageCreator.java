package org.example;


import org.example.message.Message;
import org.example.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    Message createMessage() {
        return new TextMessage();
    }
}
