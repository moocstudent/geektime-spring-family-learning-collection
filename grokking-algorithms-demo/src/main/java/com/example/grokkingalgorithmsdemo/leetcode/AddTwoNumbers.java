package com.example.grokkingalgorithmsdemo.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-03-05 15:33
 * 由于输入的两个链表都是逆序存储数字的位数的,因此两个链表中同一个位置数字可以直接相加.
 * 我们同时遍历两个链表,逐位计算它们的和,并与当前位置的进位值相加.
 * 具体而言,如果当前两个链表处相应位置的数字为n1,n2,进位值为carry,则它们的和为n1+n2+carry;
 * 其中,答案链表处相应位置的数字为(n1+n2+carry)%10,而新的进位值为(n1+n2+ccarry)/10
 * 如果两个链表的长度不同,则可认为长度短的链表的后面有若干个0.
 * 此外,如果链表遍历结束后,有carry>0,还需要在答案链表的后面附加一个节点,节点的值为carry.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers1(ListNode l1,ListNode l2){
        return null;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String resultStr = "";
        String resultStr2 = "";
        resultStr = l1.val + "";
        resultStr += ListListNode(l1);
        this.resultStr = "";
        resultStr2 = l2.val + "";
        resultStr2 += ListListNode(l2);
        String norm = new StringBuilder(resultStr).reverse().toString();
        String norm2 = new StringBuilder(resultStr2).reverse().toString();

        BigDecimal n1 = new BigDecimal(norm);
        BigDecimal n2 = new BigDecimal(norm2);
        BigDecimal now = n1.add(n2);
        String nowReverse = new StringBuilder(now + "").reverse().toString();

        String[] split = (nowReverse).split("");
        List<ListNode> listNodeList = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            ListNode listNode = setListNode(Integer.parseInt(split[i]));
            listNodeList.add(listNode);
        }
        for (int i=0;i<listNodeList.size()-1;i++){
            if(listNodeList.get(i)!=null || listNodeList.get(i+1)!=null){
                listNodeList.get(i).next = listNodeList.get(i+1);
            }
        }
        return listNodeList.get(0);
    }

    String resultStr = "";

    private String ListListNode(ListNode l1) {
        if (l1.next != null) {
            resultStr += l1.next.val;
            return ListListNode(l1.next);
        }
        return resultStr;
    }

    private ListNode setListNode(Integer nm) {
        return new ListNode(nm);
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l2);
    }
}



class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

