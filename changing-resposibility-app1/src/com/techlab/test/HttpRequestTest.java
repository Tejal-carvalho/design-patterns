package com.techlab.test;

import com.techlab.model.AuthenticationHandler;
import com.techlab.model.CompressionHandler;
import com.techlab.model.CookiesHandler;
import com.techlab.model.HttpRequestDto;

public class HttpRequestTest {

	public static void main(String[] args) {
		CookiesHandler h1=new CookiesHandler();
		AuthenticationHandler h2=new AuthenticationHandler();
		CompressionHandler h3=new CompressionHandler();
		h1.succeedWith(h2);
		h2.succeedWith(h3);
		HttpRequestDto dto=new HttpRequestDto();
		dto.usename="admin";
		dto.password="admin";
		try {
			h1.handle(dto);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
