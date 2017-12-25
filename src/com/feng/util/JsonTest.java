package com.feng.util;


import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.feng.bean.A;
import com.feng.bean.B;

public class JsonTest {
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		A a = new A();
		try {
			a = mapper.readValue("{\"name\":\"Bob\", \"age\":13}", A.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (a!=null) {
			System.out.println(a.getName());
		}
		
		String jsonString = null;
		B b = new B();
		b.setHuoban(a);
		b.setName("胖虎");
		b.setAge("178");
		try {	
			jsonString = mapper.writeValueAsString(b);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(jsonString);
		
		try {
			a = mapper.readValue(jsonString, A.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			System.out.println(a.getName()+":"+a.getAge());
	}
}
