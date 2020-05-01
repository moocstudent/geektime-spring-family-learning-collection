package com.example.nestedclassdemo.outer4;

/**
 * 静态嵌套类的语法总结
 * - 需要加修饰符static
 * - 可以定义静态成员和非静态成员
 * - 不能直接访问包围类的非静态成员,可直接访问包围类的静态成员
 *  = 可通过包围类的对象进行访问非静态成员
 * - 外界可以通过静态嵌套类名访问其静态成员,通过对象访问其非静态成员
 * - 外界需要通过包围类才可以访问到静态嵌套类,并创建其对象,不需要外部包围类的实例
 */
public class Outer4 {
    private String outField1 = "outer 111";
    private static String outStaticField2 = "outer static 222";

    /**
     * 静态嵌套类
     */
    public static class Inner4{
        //静态嵌套类可以定义静态和非静态成员
        private String innField1 = "inner 333";
        static String innStaticField2 = "inner static 444";

        public void innFun1(){
            //静态嵌套类可以直接访问包围类的静态成员
            System.out.println(innField1);
            //System.out.println(Outer4.outField1);
            System.out.println(Outer4.outStaticField2);
            System.out.println(outStaticField2);

            //静态嵌套类可以通过对象访问包围类的非静态成员
            Outer4 outObj = new Outer4();
            System.out.println(outObj.getOutField1());
        }
        public String getInnField1(){
            return this.innField1;
        }
        public static String getInnStaticField2(){
            hello();
            return innStaticField2;
        }
        public static void hello(){
            System.out.println("inner hello");
        }
    }
    public String getOutField1(){
        return this.outField1;
    }
    public static void outFun2(){
        Inner4 obj1 = new Inner4();
        Inner4 obj2 = new Inner4();
        System.out.println(obj1==obj2);//false
        System.out.println(obj1.getInnField1());
        System.out.println(Inner4.getInnStaticField2());
    }
    public static void hello(){
        System.out.println("outer hello");
    }

}
