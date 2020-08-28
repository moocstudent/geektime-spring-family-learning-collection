package com.example.droolshelloworlddemo;

import com.example.droolshelloworlddemo.model.ComparisonOperatorEntity;
import org.drools.core.base.RuleNameEqualsAgendaFilter;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2020-08-16 14:08
 */
@SpringBootTest
public class ComparisonTest {
    @Test
    public void test2(){
        //1,获取KieServices 或者使用KieTemplate沉默反补
        KieServices kieServices = KieServices.Factory.get();
        //2,获取kieServices容器对象 会默认读取META-INFO的kmodule.xml
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //3,从Kie容器对象中获取会话对象 会先获取默认的session对象
        KieSession kieSession = kieContainer.newKieSession("comparison-rules");
        //4,设定Fact
        ComparisonOperatorEntity fact = new ComparisonOperatorEntity();
        fact.setNames("张三");
        fact.setList(Arrays.asList("张三1","李四","王二"));
        //5,fact插入到工作内存中去
        kieSession.insert(fact);
        //6,激活规则,由Drools框架自动进行规则匹配,如果规则匹配成功,则执行当前规则
//        kieSession.fireAllRules();
//        kieSession.fireAllRules();
        //只执行指定名称的规则,ruleName必须相等
        kieSession.fireAllRules(new RuleNameEqualsAgendaFilter("comparison_matches"));
        //7,关闭会话session
        kieSession.dispose();
    }

}
