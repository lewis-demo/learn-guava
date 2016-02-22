package org.learn.soap.cxf;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
