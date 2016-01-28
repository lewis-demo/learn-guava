package org.learn.soap.java;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);

}
