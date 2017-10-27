package org.jaxrs.messenger.service;

import java.util.ArrayList;
import java.util.List;
import org.jaxrs.messenger.model.Message;;

public class MessageService
{
	public List<Message> getAllMessages()
	{
		Message m1 = new Message(1L, "Hello World", "Sunny");
		Message m2 = new Message(2L, "Hello Jersey", "Sunny");
		List<Message> messages = new ArrayList<>();
		messages.add(m1);
		messages.add(m2);
		return messages;
	}
}
