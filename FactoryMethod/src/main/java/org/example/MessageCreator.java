package org.example;


import org.example.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 *
 */
public abstract class MessageCreator {


    // nhường việc khởi tao object lại cho các class con -> class cha làm việc trên object được return
    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }


    // Factory method -> subclass need to implement
    // nhường việc khởi tao object lại cho các class con
   abstract Message createMessage();

	
}
