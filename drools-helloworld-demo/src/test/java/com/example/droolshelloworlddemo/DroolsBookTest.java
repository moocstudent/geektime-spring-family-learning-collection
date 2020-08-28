package com.example.droolshelloworlddemo;

import com.example.droolshelloworlddemo.model.ComparisonOperatorEntity;
import com.example.droolshelloworlddemo.model.Customer;
import com.example.droolshelloworlddemo.model.Order;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhangQi
 * @Date: 2020-08-15 15:01
 */
@SpringBootTest
public class DroolsBookTest {

    @Test
    public void test1(){
        //1,获取KieServices 或者使用KieTemplate沉默反补
        KieServices kieServices = KieServices.Factory.get();
        //2,获取kieServices容器对象 会默认读取META-INFO的kmodule.xml
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //3,从Kie容器对象中获取会话对象 会先获取默认的session对象
        KieSession kieSession = kieContainer.newKieSession("books-rules");
        //4,设定Fact
        Order order = new Order();
        order.setOriginalPrice(150d);
        Customer customer = new Customer();
        customer.setAge(26);
        customer.setGender("male");
        //5,fact插入到工作内存中去
        System.out.println(">>优惠前价格: "+order.getOriginalPrice());
        kieSession.insert(order);
        kieSession.insert(customer);
        //6,激活规则,由Drools框架自动进行规则匹配,如果规则匹配成功,则执行当前规则
//        kieSession.fireAllRules();
        kieSession.fireAllRules();
        //7,关闭会话session
        kieSession.dispose();

        System.out.println("优惠后价格: "+order.getRealPrice());
    }


}
