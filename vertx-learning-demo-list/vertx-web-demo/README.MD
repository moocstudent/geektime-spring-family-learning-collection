解析:     
HttpServer:  
http/https/websockets服务器,vert.x发布restful服务,不需要tomcat提供servlet容器,
它自己就是一台性能强大的web服务器,并且原生支持负载均衡

---

Router类:    
Router类可以理解为一个路由器,它接收httpServer带来的请求,并将不同的请求分发到不同的路由中,
如果简单对比一下springmvc的话,可以将router理解为springmvc中的dispatcher.

router是Vert.x Web的基础,负责分发HTTP请求到handler(处理器),
在Vert.x Web中还有两个很重要的概念.

Routes - 定义请求的分发     
Handlers - 这是实际处理请求并且返回结果的地方,Handlers可以被链接起来使用.

router::accept, 它标识引用一个方法(这里引用router的accept方法).当接收一个请求的时候,
告诉vert.x从router里调用accept方法.
    
    
---

route:   
route代表一条路由,同样,对比springmvc,相当于spring中的@RequestMapping,它指定了restful api
的请求接口路径,并将其交给handler来处理该条路由.        

---

Handler:    
handler处理具体的路由请求,字面上讲就是处理某个具体的restful api,它与httpserver,
router,route的关系如下:

来自httpServer的request请求-->交由路由器Router做分发处理-->
路由器Router匹配到具体的路由规则route-->路由到最终的handler去处理请求

---

Vert.x默认提供了很多处理器,包括但不局限于以下:     

AuthHandler 处理权限校验支持     
BodyHandler 提供所有请求上下文    
CookieHandler 提供cookie支持
SessionHandler 提供session支持
RoutingContext: 请求上下文,可以理解为servlet中的httpRequest和httpResponse
