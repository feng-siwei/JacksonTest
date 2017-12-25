package com.cxf.testauto;

import com.feng.util.HttpRequest;

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//发送 GET 请求
        String s=HttpRequest.sendGet("http://restapi.amap.com/v3/ip", "key=7cb39549f0bcefb820d09735306df796&ip=114.247.50.2");
        System.out.println(s);
        
        //发送 POST 请求
        String sr=HttpRequest.sendPost("http://restapi.amap.com/v3/ip", "key=7cb39549f0bcefb820d09735306df796");
        System.out.println(sr);

	}

}
