package org.learn.soap.spring.cxf.wss4j;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
