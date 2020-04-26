package com.example.aopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 通过启动TestAop
 * 更改classpath下的aops.xml
 * 自动进行方法的更新 前置方法的更改
 *
 * 面向对象:将需求功能划分为不同的,独立,封装良好的类,并让它们
 * 通过继承和多态实现相同和不同的行为.
 *
 * 面向切面:将通用需求功能从众多类中分离出来,使得很多类共享一个
 * 行为,一旦发生变化,不必修改很多类,而只需要修改这个行为即可.
 *
 * 面向切面编程:
 * - 分离代码的耦合(高内聚,低耦合)
 * - 业务逻辑变化不需要修改源代码/不用重启
 * - 加快编程和测试速度
 *
 * - 一个概念/规范,没有限定语言
 * - 不是取代OOP编程,而是OOP的补充,和数据库的触发器有点相似
 * 主要内容
 * - Aspect:配置文件,包括一些Pointcut和相应的Advice
 * - Joint point:在程序中明确定义的点,如方法调用,对类成员访问等
 * - Pointcut:一组joint point,可以通过逻辑关系/通配符/正则等组合起来,
 * 定义了相应advice将要发生的地方
 * - Advice:定义了在pointcut处要发生的动作,通过before/after/around/来关联
 * - weaving:advice代码在具体joint point的关联方式
*/
@SpringBootApplication
public class AopDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);
    }

}
