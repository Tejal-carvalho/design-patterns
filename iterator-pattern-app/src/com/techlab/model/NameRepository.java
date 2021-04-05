package com.techlab.model;

public class NameRepository {
	private String[] names;

	public NameRepository() {
		names = loadFromCsv().split(",");
	}

	private String loadFromCsv() {
		return "abc,xyz,lmo,pqr";
	}

	public Iterator makeIterator() {
		return new NamesArrayIterator(this);
	}

	private class NamesArrayIterator implements Iterator{
		private NameRepository repo;
		private int index=0;

		public NamesArrayIterator(NameRepository repo) {
			this.repo = repo;
		}

		@Override
		public String next() {
			String val=repo.names[index];
			index++;
			return val;
		}

		@Override
		public boolean hasNext() {
			return(index<repo.names.length);
		}

	}

}
