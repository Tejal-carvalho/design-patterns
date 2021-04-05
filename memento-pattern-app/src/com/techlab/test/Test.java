package com.techlab.test;



import com.techlab.model.Editor;
import com.techlab.model.History;

public class Test {

	public static void main(String[] args) {
		Editor e=new Editor(1,"notepad","hello");
		History history=new History();
		System.out.println(e.getContent());
		e.setContent("world");
		System.out.println(e.getContent());
		history.add(e.serialize());
		e.setContent("how are you");
		System.out.println(e.getContent());
		e.setContent("i am fine");
		history.add(e.serialize());
		System.out.println(e.getContent());
		e.deserialize(history.get(0));
		System.out.println(e.getContent());
	

	}

}
