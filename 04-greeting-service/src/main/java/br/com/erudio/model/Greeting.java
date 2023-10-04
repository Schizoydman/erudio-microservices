package br.com.erudio.model;

public class Greeting {
	
	private final long id;
	private final String content;
	
	public Greeting(long l, String content) {
		this.id = l;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
	
}