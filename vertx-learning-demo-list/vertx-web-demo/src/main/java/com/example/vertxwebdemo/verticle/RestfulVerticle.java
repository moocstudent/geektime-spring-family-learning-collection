package com.example.vertxwebdemo.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.StaticHandler;
import org.springframework.util.StringUtils;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 9:32
 */
public class RestfulVerticle extends AbstractVerticle {

    @Override
    public void start(){
        //实例化一个路由器出来,用来路由不同的rest接口
        Router router = Router.router(vertx);
        //增加一个处理器,将请求的上下文信息,放到RoutingContext中
        router.route().handler(BodyHandler.create());

        //处理一个get方法的rest接口
        router.get("/get/:param1/:param2").handler(this::handlerGet);
        //router.route("/get/:param1/:param2").handler(this::handlerGet);
        router.route("/assets/*").handler(StaticHandler.create("assets"));
        //创建一个httpServer,监听8080端口,并交由路由器分发处理用户请求
        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }

    private void handlerGet(RoutingContext context) {
        String param1 = context.request().getParam("param1");
        String param2 = context.request().getParam("param2");
        if(StringUtils.isEmpty(param1) || StringUtils.isEmpty(param2)){
            context.response().setStatusCode(400).end();
        }
        JsonObject obj = new JsonObject();
        obj.put("method","get").put("param1",param1).put("param2",param2);

        context.response().putHeader("content-type","application/json")
                .end(obj.encodePrettily());
    }
}
