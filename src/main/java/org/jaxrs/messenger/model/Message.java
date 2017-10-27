package org.jaxrs.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message
{
	private long id;
	private String message;
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public Date getCreated()
	{
		return created;
	}
	public void setCreated(Date created)
	{
		this.created = created;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	private Date created;
	private String author;
	
	public Message()
	{
		
	}
	
	public Message(long id, String message, String author)
	{
		setId(id);
		setMessage(message);
		setAuthor(author);
		setCreated(new Date());
	}
}
