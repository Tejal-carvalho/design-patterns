package com.techlab.model;

public abstract class HttpRequestHandler {
	private HttpRequestHandler next;
	
	public void succeedWith(HttpRequestHandler next) {
		this.next=next;
	}
	protected void callNext(HttpRequestDto dto) throws Exception {
		if(next!=null) {
			next.handle(dto);
		}
		
	}
	public abstract void handle(HttpRequestDto dto) throws Exception;

}
