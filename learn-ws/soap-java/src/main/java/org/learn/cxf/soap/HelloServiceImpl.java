package org.learn.cxf.soap;

import javax.jws.WebService;

@WebService(
	serviceName = "HelloService",
	portName = "HelloServicePort",
	endpointInterface = "org.learn.cxf.soap.HelloService"
)
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "hello " + name;
	}

}
