/*
第三种解决思路是：将参数放到另外一个全局变量中。具体的代码实现如下。
Config 是一个存储了 paramA 和 paramB 值的全局变量。
里面的值既可以像下面的代码那样通过静态常量来定义，也可以从配置文件中加载得到。
实际上，这种方式是最值得推荐的。
 */

package com.example.designpatterndemo.singleton;

/**
 * @Author: Frank
 * @Date: 2021-06-06 18:56
 */
public class ConfigSingleton {

    public class Config {
        public static final int PARAM_A = 123;
        public static final int PARAM_B = 245;
    }

    private static ConfigSingleton instance = null;
    private final int paramA;
    private final int paramB;

    private ConfigSingleton() {
        this.paramA = Config.PARAM_A;
        this.paramB = Config.PARAM_B;
    }

    public synchronized static ConfigSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigSingleton();
        }
        return instance;
    }

    @Override
    public String toString(){
        return "A:"+paramA+",B:"+paramB;
    }

    public static void main(String[] args) {
        ConfigSingleton instance = getInstance();
        System.out.println(instance);
    }
}
