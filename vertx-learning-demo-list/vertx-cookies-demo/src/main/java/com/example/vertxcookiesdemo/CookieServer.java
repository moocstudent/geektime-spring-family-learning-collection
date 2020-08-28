package com.example.vertxcookiesdemo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.Cookie;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.CookieHandler;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 10:39
 */
public class CookieServer extends AbstractVerticle {

    @Override
    public void start() {
        Router router = Router.router(vertx);
        router.route().handler(CookieHandler.create());
        router.route().handler(routingContext -> {
            //get Cookie
            Cookie cookie = routingContext.getCookie("testCookie");
            Integer c = 0;
            //if not null increase
            if (cookie != null) {
                String count = cookie.getValue();
                try {
                    c = Integer.valueOf(count);
                } catch (NumberFormatException e) {
                    c = 0;
                }
                c++;
            }
            //add the cookie to Cookie
            routingContext.addCookie(Cookie.cookie("testCookie", String.valueOf(c)));
            //show you cookie count
            routingContext.response().putHeader("content-type", "text/html")
                    .end("total visit count:" + c);
        });
        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
