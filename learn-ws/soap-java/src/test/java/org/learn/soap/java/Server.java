package org.learn.soap.java;

import javax.xml.ws.Endpoint;

/**
 * 使用JDK提供的工具{@link javax.xml.ws.Endpoint}发布WS。
 * 
 * @author lewis007
 * @since 1.0
 */
public class Server {

	/**
	 * WS地址：http://localhost:8080/ws/soap/hello?wsdl
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String address = "http://localhost:8080/ws/soap/hello";
		HelloService helloService = new HelloServiceImpl();

		Endpoint.publish(address, helloService);
		System.out.println("ws is published");
	}

}
