package org.learn.soap.cxf;

import javax.jws.WebService;

/**
 * 接口实现类。<BR/>
 * 这里简化了实现类上的WebService注解的配置，让CXF自动为我们取默认值即可
 * 
 * @author lewis007
 * @since 1.0
 */
@WebService
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "hello " + name;
	}

}
