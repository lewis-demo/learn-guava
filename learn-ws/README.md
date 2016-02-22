## `soap-java`
使用JDK内置的工具发布和调用WS
 * `org.learn.soap.java.HelloService`: 接口
 * `org.learn.soap.java.HelloServiceImpl`: 实现类
 * `org.learn.soap.java.Server`: 发布WS，通过`javax.xml.ws.Endpoint`发布
 * `org.learn.soap.java.DynamicClient`: 调用WS，通过JDK提供的动态代理调用WS，直接面向WSDL编程

## `soap-cxf`
使用CXF内置的Jetty发布WS
 * `org.learn.soap.cxf.HelloService`: 接口
 * `org.learn.soap.cxf.HelloServiceImpl`: 实现类
 * `org.learn.soap.cxf.JaxWsServer`: 发布WS，基于JAX-WS
 * `org.learn.soap.cxf.SimpleServer`: 发布WS，基于Simple
