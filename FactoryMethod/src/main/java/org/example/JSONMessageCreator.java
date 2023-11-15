package org.example;

import org.example.message.JSONMessage;
import org.example.message.Message;

/**
 * Provides implementation for creating JSON messages
 * nhường việc khởi tạo object lại cho subclass
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    Message createMessage() {
        return new JSONMessage();
    }
}
