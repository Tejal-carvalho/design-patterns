package com.techlab.model;

public class AuthenticationHandler extends HttpRequestHandler {

	@Override
	public void handle(HttpRequestDto dto) throws Exception {
		System.out.println("Handling authentication");
		if(!(dto.usename.equals("admin")&& dto.password.equals("admin"))){
			throw new Exception("wrong usename or password");
		}
		this.callNext(dto);
	}

}
