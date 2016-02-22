package org.learn.soap.spring.cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
