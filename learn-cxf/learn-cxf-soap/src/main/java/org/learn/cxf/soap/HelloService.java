package org.learn.cxf.soap;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
