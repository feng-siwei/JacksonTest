package com.cxf.testauto;

import javax.jws.WebService;

@WebService
public interface MyService {
	 public String sayHello(String username, String address, String school); 
}
