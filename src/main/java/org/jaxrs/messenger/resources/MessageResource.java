package org.jaxrs.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jaxrs.messenger.model.Message;
import org.jaxrs.messenger.service.*;

@Path("messages")
public class MessageResource
{
	MessageService messageService = new MessageService(); 
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return messageService.getAllMessages();
	}
	
	
}
