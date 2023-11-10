package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message again");
		MessagePrinter printer = new MessagePrinter();
		// caller provide dependencies
		Formatter formatter  =  new JSONFormatter();
		PrintWriter printWriter = new PrintWriter(new FileWriter("test_msg.txt"));
		// thay đổi yêu cầu viết ra console
		printWriter = new PrintWriter(System.out);
		printer.writeMessage(msg,formatter,printWriter);
	}

}
