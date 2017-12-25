package com.cxf.testauto;

public class MyServiceImpl implements MyService {

	@Override
	public String sayHello(String username, String address, String school) {
		System.out.println("sayHello is invoked!");

		String result = "hello: " + username + ", your info is: " + address
				+ ", " + school;

		return result;
	}

}
