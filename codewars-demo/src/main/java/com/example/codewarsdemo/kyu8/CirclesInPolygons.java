/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.codewarsdemo.kyu8;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: zhangQi
 * @Date: 2021-08-03 22:50
 * You are the owner of a box making company.
 *
 * Your company can produce any equal sided polygon box,
 * but plenty of your customers want to transport circular objects in these boxes.
 * Circles are a very common shape in the consumer industry. Tin cans, glasses,
 * tyres and CD's are a few examples of these.
 *
 * As a result you decide to add this information on your boxes:
 * The largest (diameter) circular object that can fit into a given box.
 */
public class CirclesInPolygons {

    public static void main(String[] args) {
        Polygon polygon = new Polygon(3, 4);
        double v = polygon.circleDiameter();
        System.out.println(v);
    }

    public static class Polygon {
        int sides;
        int sideLength;

        public Polygon(int sides, int sideLength) {
            this.sides = sides;
            this.sideLength = sideLength;
        }

        public double circleDiameter(){
            //Your code comes here
            return sideLength/Math.tan(Math.toRadians(180d/sides));
        }

    }
}
