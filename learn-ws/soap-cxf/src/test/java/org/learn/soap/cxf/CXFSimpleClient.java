package org.learn.soap.cxf;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

public class CXFSimpleClient {

	public static void main(String[] args) {
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setAddress("http://localhost:8080/ws/soap/hello");
		factory.setServiceClass(HelloService.class);
		HelloService helloService = factory.create(HelloService.class);
		String result = helloService.say("world");
		System.out.println(result);
	}

}
