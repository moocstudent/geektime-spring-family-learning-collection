package com.example.guavademo;

import com.example.guavademo.test.Test;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-02-01 9:39
 */
public class TestCheckNotNulls {

    public static void main(String[] args) {

        String variable = "";
        String variable1 = null;

        String p = Preconditions.checkNotNull(variable);
//        String p1 = Preconditions.checkNotNull(variable1); //null pointer

//        Preconditions.checkNotNull(variable1,"不能为空",1);

        Preconditions.checkNotNull(variable1,"不能为空");

        System.out.println(p);
//        System.out.println(p1);

        double testDouble = 0.1;
        double testDouble1 = 0;
        Preconditions.checkArgument(testDouble>0,"value must be gt 0",testDouble);
        try {
            Preconditions.checkArgument(testDouble1>0,"value must be gt 0",testDouble1);
        } catch (Exception e) {
//            e.printStackTrace();
        }

        boolean running = false;
        boolean running1 = true;

        try {
            Preconditions.checkState(running,"must running");
        } catch (Exception e) {
//            e.printStackTrace();
        }
        Preconditions.checkState(running1,"must running");

        Test test = new Test();

        List list = new ArrayList();

        List list1 = null;

        boolean present = Optional.of(test).isPresent();
        System.out.println(present);

    }


}
