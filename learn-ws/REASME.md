## soap-java

 * `HelloService` WS接口
 * `HelloServiceImpl` WS接口实现类
 
 * `Server` 通过JDK提供的工具`javax.xml.ws.Endpoint`发布WS
 * `DynamicClient` 通过JDK提供的动态代理调用哪个WS，直接面向WSDL编程

## soap-cxf

使用 CXF 内置的 Jetty 发布 WS