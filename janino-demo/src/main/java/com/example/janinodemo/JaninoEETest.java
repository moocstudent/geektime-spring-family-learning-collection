package com.example.janinodemo;
import org.codehaus.janino.ExpressionEvaluator;

/**
 * @author ukyo
 * 测试使用janino
 * 老师推荐
 */
public class JaninoEETest {
    public static void main(String[] args) {
        //Now here's where the story begins...
        try {
            ExpressionEvaluator ee = new ExpressionEvaluator();
//            ee.cook("3 + 4");
//            System.out.println(ee.evaluate(null));

            //The expression will have two "int" parameters:"a" and "b"
            ee.setParameters(new String[]{"a","b"},new Class[]{int.class,int.class});

            //And the expression(i.e. "result")type is also "int".
            ee.setExpressionType(int.class);

            //And now we "cook"(scan,parse,compile and load)the fabulous expression.
            ee.cook("a+b");

            //Eventually we evaluate the expression - and that goes super-fast.
            int result = (Integer) ee.evaluate(new Object[]{19,23});
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
}
