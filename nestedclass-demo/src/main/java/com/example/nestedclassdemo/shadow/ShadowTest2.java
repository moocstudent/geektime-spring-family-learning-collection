package com.example.nestedclassdemo.shadow;

public class ShadowTest2 {

    public int x = 0;

    public void f1(){
        //局部内部类无法访问得到!
        int x = 20;

        class FirstLevel{
            public final int x = 1;

            void methodInFirstLevel(int x){
                System.out.println("x = "+x); //line 14 x
                System.out.println("this.x = "+this.x); //line 12 x
                System.out.println("ShadowTest.this.x = "+ShadowTest2.this.x); //line 5 x
            }
        }

        FirstLevel obj = new FirstLevel();
        obj.methodInFirstLevel(10);
    }

    public static void main(String... args) {
        ShadowTest2 st = new ShadowTest2();
        st.f1();
    }
}
