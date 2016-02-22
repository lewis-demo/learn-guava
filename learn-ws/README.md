## soap-java

使用JDK内置的工具发布和调用WS

| ABCD | EFGH | IJKL |
| -----|:----:| ----:|
| a    | b    | c    |
| d    | e    |  f   |
| g    | h    |   i  |

| 文件 | 描述 | 备注 |


 * `org.learn.soap.java.HelloService` WS接口
 * `org.learn.soap.java.HelloServiceImpl` WS接口实现类
 * `org.learn.soap.java.Server` 通过JDK提供的工具`javax.xml.ws.Endpoint`发布WS
 * `org.learn.soap.java.DynamicClient` 通过JDK提供的动态代理调用哪个WS，直接面向WSDL编程

## soap-cxf

使用 CXF 内置的 Jetty 发布 WS