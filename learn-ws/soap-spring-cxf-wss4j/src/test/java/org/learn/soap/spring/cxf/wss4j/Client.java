package org.learn.soap.spring.cxf.wss4j;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client-PasswordDigest.xml");

		HelloService helloService = context.getBean("helloService", HelloService.class);
		String result = helloService.say("world");
		System.out.println(result);
	}

}
