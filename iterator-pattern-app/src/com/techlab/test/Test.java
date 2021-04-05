package com.techlab.test;

import com.techlab.model.Iterator;
import com.techlab.model.NameRepository;

public class Test {
	public static void main(String args[]) {
		NameRepository repo=new NameRepository();
		Iterator itr=repo.makeIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
