/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.proxydemo.dynamicproxyprocess;

import com.example.proxydemo.subject.Subject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: zhangQi
 * @Date: 2021-04-14 9:34
 */
@Component
public class NodeHandler implements InvocationHandler {

    @Resource
    private Subject subject;

    private String nodeCode;

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("judgment nodeCode :"+nodeCode);
        System.out.println(proxy.getClass().getName());
        //定义预处理的工作,当然你也可以根据method的不同进行不同的预处理工作
        System.out.println("====before====");
        System.out.println("====after====");
        Object result = method.invoke(subject, args);
        System.out.println("result:"+result);
        return result;
    }
}
