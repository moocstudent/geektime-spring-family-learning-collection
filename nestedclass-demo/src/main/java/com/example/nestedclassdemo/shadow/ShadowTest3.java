package com.example.nestedclassdemo.shadow;

public class ShadowTest3 {

    public int x = 0;

    public void f1(){
        //可以访问得到,没有被遮蔽!
        int x = 20;

        class FirstLevel{
            void methodInFirstLevel(){
                System.out.println("x = "+x);//line 9 x
                System.out.println("ShadowTest3.this.x = "+ShadowTest3.this.x); //line 5 x
            }
        }

        //x=30;
        FirstLevel obj = new FirstLevel();
        obj.methodInFirstLevel();
    }

    public static void main(String... args) {
        ShadowTest3 st = new ShadowTest3();
        st.f1();
    }
}
