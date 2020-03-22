package com.example.janinodemo;

import org.codehaus.commons.compiler.CompileException;
import org.codehaus.janino.ScriptEvaluator;

import java.lang.reflect.InvocationTargetException;

public class JaninoEEMethodTest {
    public static void main(String[] args) {
        ScriptEvaluator se = new ScriptEvaluator();
        try {
            se.cook(
                    ""
                    +"static void method1(){\n"
                    +" System.out.println(1);\n"
                    +"}\n"
                    +"method1();\n"
                    +"method2();\n"
                    +"\n"
                    +"static void method2() {\n"
                    +" System.out.println(2);\n"
                    +"}\n"
            );
            //求值
            se.evaluate(new Object[0]);
        } catch (CompileException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
