package org.learn.soap.java;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * 使用JDK的动态代理调用WS。
 * 
 * @author lewis007
 * @since 1.0
 */
public class DynamicClient {

	/**
	 * 只需在本地提供一个HelloService的接口，直接面向WSDL编程，只不过您需要分别定义出serviceName与portName
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL wsdl = new URL("http://localhost:8080/ws/soap/hello?wsdl");
			QName serviceName = new QName("http://java.soap.learn.org/", "HelloService");
			QName portName = new QName("http://java.soap.learn.org/", "HelloServicePort");
			Service service = Service.create(wsdl, serviceName);

			HelloService helloService = service.getPort(portName, HelloService.class);
			String result = helloService.say("world");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
