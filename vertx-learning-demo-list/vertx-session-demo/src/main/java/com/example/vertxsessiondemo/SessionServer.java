package com.example.vertxsessiondemo;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.Session;
import io.vertx.ext.web.handler.CookieHandler;
import io.vertx.ext.web.handler.SessionHandler;
import io.vertx.ext.web.sstore.LocalSessionStore;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 10:13
 */
public class SessionServer extends AbstractVerticle {
    
    @Override
    public void start(){
        Router router = Router.router(vertx);
        //增加cookies处理器,解码cookies,并将其放到context上下文中
        router.route().handler(CookieHandler.create());
        //增加session处理器,为每次用户请求,维护一个唯一的session,这里使用内存session,后面会讲到分布式的session存储
        router.route().handler(
                SessionHandler.create(LocalSessionStore.create(vertx)));
        router.route().handler(routingContext->{
            //从请求上下文获取session
            Session session = routingContext.session();
            Integer count = session.get("count");
            if(count==null){
                count = 0;
            }
            count++;
            session.put("count",count);

            routingContext.response()
                    .putHeader("content-type","text/html")
                    .end("total visit count:"+session.get("count"));
        });
        //开启verticle服务
        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
