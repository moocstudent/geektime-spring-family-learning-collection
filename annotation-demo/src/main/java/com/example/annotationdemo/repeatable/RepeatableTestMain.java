package com.example.annotationdemo.repeatable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@CommonAnnotation
//@CommonAnnotation
@RepeatableAnnotation
@RepeatableAnnotation
public class RepeatableTestMain {

    public static void main(String[] args) throws Exception {
        String className = "com.example.annotationdemo.repeatable.RepeatableTest";
        for (Method m : Class.forName(className).getMethods()) {
            if (m.isAnnotationPresent(RepeatableAnnotations.class)) {
                //获取所有容器注解
                RepeatableAnnotation[] annos = m.getAnnotationsByType(RepeatableAnnotation.class);
                for (RepeatableAnnotation anno : annos) {
                    System.out.println("================================");
                    System.out.println(anno.a() + "," + anno.b() + "," + anno.c());
                    try {
                        m.invoke(null, anno.a(), anno.b(), anno.c());
                    } catch (Throwable e) {
                        System.out.printf("Test %s failed: %s %n", m, e.getCause());
                        System.out.println("================================");
                    }
                }
            }
        }
    }

}
