package de.htw.core;

class DocumentManagerImpl implements DocumentManager {
	private String theFoo = "bar";
	
	public synchronized String getFoo() {
		return theFoo;
	}

	public synchronized void setFoo(String foo) {
		this.theFoo = foo;
	}

}
