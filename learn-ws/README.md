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
 * `org.learn.soap.cxf.JaxWsServer`: 基于JAX-WS方式发布WS
 * `org.learn.soap.cxf.SimpleServer`: 基于Simple方式发布WS

以Simple方式发布的WS，不能通过JAX-WS方式来调用，只能通过Simple方式实现的客户端来调用。

通过CXF内置的Jetty发布的WS，仅能查看WSDL，无法查看WS控制台。

## `soap-spring-cxf`

在Web容器中使用Spring+CXF发布WS

 * `org.learn.soap.spring.cxf.HelloService`: 接口
 * `org.learn.soap.spring.cxf.HelloServiceImpl`: 实现类
 * `applicationContext.xml`: Spring配置文件，用于初始化Spring Java Bean，并加载`spring-cxf-[type].xml`
 * `spring-cxf-[type].xml`: Spring & CXF结合的配置文件
  * `spring-cxf-jaxws-server.xml`
  * `spring-cxf-jaxws-endpoint.xml` 推荐使用
  * `spring-cxf-simple-server.xml`

资源访问地址：
 * URL: http://localhost:8080/soap-spring-cxf/service
 * WSDL: http://localhost:8080/soap-spring-cxf/service/soap/hello?wsdl



