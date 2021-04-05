package com.techlab.model;

public class Editor {
	private int id;
	private String name;
	private String content;
	
	public Editor(int id,String name,String content) {
		this.id=id;
		this.name=name;
		this.content=content;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setContent(String content) {
		this.content=content;
	}
	public String getContent() {
		return content;
	}
	public Memento serialize() {
		return new Memento(this.content);
	}
	public void deserialize(Memento m) {
		this.content=m.getContent();
	}

}
