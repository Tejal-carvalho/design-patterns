package com.techlab.model;

public class CookiesHandler extends HttpRequestHandler{

	@Override
	public void handle(HttpRequestDto dto) throws Exception {
		System.out.println("Handling cookies");
		System.out.println("storing info in cookies");
		this.callNext(dto);
		
		
	}

}
