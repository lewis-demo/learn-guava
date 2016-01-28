package org.learn.soap.java;

import javax.jws.WebService;

@WebService(
	serviceName = "HelloService",
	portName = "HelloServicePort",
	endpointInterface = "org.learn.soap.java.HelloService"
)
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "hello " + name;
	}

}
