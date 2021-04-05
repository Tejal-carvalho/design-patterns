package com.techlab.model;

import java.util.ArrayList;

public class History {
	ArrayList<Memento> states;

	public History() {
		states = new ArrayList<Memento>();
	}

	public void add(Memento m) {
		states.add(m);
	}

	public Memento get(int index) {
		return states.get(index);
	}

}
