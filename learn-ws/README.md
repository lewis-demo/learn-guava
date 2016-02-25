## `soap-java`

使用JDK内置的工具发布和调用WS

 * `org.learn.soap.java.HelloService`: 接口
 * `org.learn.soap.java.HelloServiceImpl`: 实现类
 * `org.learn.soap.java.Server`: 发布WS，通过`javax.xml.ws.Endpoint`发布
 * `org.learn.soap.java.DynamicClient`: 调用WS，通过JDK提供的动态代理调用WS，直接面向WSDL编程

资源访问地址：
 * [http://localhost:8080/ws/soap/hello?wsdl](http://localhost:8080/ws/soap/hello?wsdl "WSDL")

## `soap-cxf`

使用CXF内置的Jetty发布WS

 * `org.learn.soap.cxf.HelloService`: 接口
 * `org.learn.soap.cxf.HelloServiceImpl`: 实现类
 * `org.learn.soap.cxf.JaxWsServer`: 基于JAX-WS方式发布WS
 * `org.learn.soap.cxf.SimpleServer`: 基于Simple方式发布WS
 * `org.learn.soap.cxf.JaxWsInterceptorServer`: 基于JAX-WS方式发布WS，增加输入/输出拦截器
 * `org.learn.soap.cxf.JaxWsClient`: 静态代理客户端，通过静态代理方式调用WS，这种方案需要自行通过WSDL打客户端jar包
 * `org.learn.soap.cxf.JaxWsDynamicClient`: 动态代理客户端，通过动态代理方式调用WS，这种方案无需通过WSDL打客户端jar包
 * `org.learn.soap.cxf.JaxWsInterceptorClient`: 动态代理客户端，通过动态代理方式调用WS，这种方案无需通过WSDL打客户端jar包，增加输入/输出拦截器
 * `org.learn.soap.cxf.DynamicClient`: 通用动态代理客户端，这种方案与“方案二”类似，但不同的是，它不仅用于调用JAX-WS方式发布的WS，也用于使用Simple方式发布的WS，更加智能了。
 * `org.learn.soap.cxf.CXFSimpleClient`: 基于CXF Simple方式的客户端，这种方式仅用于调用Simple方式发布的WS，不能调用JAX-WS方式发布的WS。

以Simple方式发布的WS，不能通过JAX-WS方式来调用，只能通过Simple方式实现的客户端来调用。

通过CXF内置的Jetty发布的WS，仅能查看WSDL，无法查看WS控制台。

资源访问地址：
 * [http://localhost:8080/ws/soap/hello?wsdl](http://localhost:8080/ws/soap/hello?wsdl "WSDL")

## `soap-spring-cxf`

在Web容器中使用Spring + CXF发布WS

 * `org.learn.soap.spring.cxf.HelloService`: 接口
 * `org.learn.soap.spring.cxf.HelloServiceImpl`: 实现类
 * `applicationContext.xml`: Spring配置文件，用于初始化Spring Java Bean，并加载`spring-cxf-[type].xml`
 * `spring-cxf-[type].xml`: Spring & CXF结合的配置文件，推荐使用endpoint
  * `spring-cxf-jaxws-server.xml`
  * `spring-cxf-jaxws-endpoint.xml`
  * `spring-cxf-jaxws-endpoint-interceptor.xml`
  * `spring-cxf-bus-endpoint-interceptor.xml`
  * `spring-cxf-simple-server.xml`
 * `org.learn.soap.spring.cxf.Client`: 调用WS
 * `spring-client-1.xml`: 使用JaxWsProxyFactoryBean
 * `spring-client-2.xml`: 使用jaxws:client，推荐使用
 * `spring-client-3.xml`: 使用jaxws:client，增加输入/输出拦截器

资源访问地址：
 * [http://localhost:8080/soap-spring-cxf/ws](http://localhost:8080/soap-spring-cxf/ws "控制台")
 * [http://localhost:8080/soap-spring-cxf/ws/soap/hello?wsdl](http://localhost:8080/soap-spring-cxf/ws/soap/hello?wsdl "WSDL")
