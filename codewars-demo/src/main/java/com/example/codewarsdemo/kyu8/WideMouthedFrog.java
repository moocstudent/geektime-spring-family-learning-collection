/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 *
 * The wide-mouth frog is particularly interested in the eating habits of other creatures.

He just can't stop asking the creatures he encounters what they like to eat. But,
* then he meets the alligator who just LOVES to eat wide-mouthed frogs!

When he meets the alligator, it then makes a tiny mouth.

Your goal in this kata is to create complete the mouth_size method this method takes
*  one argument animal which corresponds to the animal encountered by the frog.
* If this one is an alligator (case-insensitive) return small otherwise return wide
 */

package com.example.codewarsdemo.kyu8;

public class WideMouthedFrog{
  public static void main(String[] args) {
    String some = mouthSize("some");
    System.out.println(some);
  }
  public static String mouthSize(String animal){
   // your code here
    if (animal.equalsIgnoreCase("alligator")){
      return "small";
    }else{
      return "wide";
    }
  }
}