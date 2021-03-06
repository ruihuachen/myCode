package com.leetcode.stringManipulation;

import java.util.ArrayList;
import java.util.List;


/**
 * s = "I am a student"
 * Return "student a am I"
 *
 * 将每个单词翻转，然后将整个字符串翻转。
 *
 */
public class Reverse {

    public static void main(String[] args) {
        String s = "I am a student";

        StringInversion("I want to spend the rest of my life with you");

    }

    public static void StringInversion(String str) {

        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();


        int begin = 0;
        for (int i=0; i<chars.length; i++) {
            if (chars[i] == ' ' || i==chars.length -1) {
                result.add(str.substring(begin, i));
                begin = i+1;
            }
        }

        for (int i=result.size()-1; i>=0; i--) {
            System.out.print(result.get(i) + " ");
        }

    }

    public void inversion(String s) {
        List<String> res = new ArrayList<>();

        char[] array = s.toCharArray();

        int index =0;
        for (int i=0; i<array.length; i++) {
            if (array[i] == ' ' || array[i] == array.length-1) {
                res.add(s.substring(i, index));
                index = i+1;
            }
        }

        for (int k=res.size()-1; k>=0; k++) {
            System.out.println(res.get(k) + " ");
        }
    }


}
