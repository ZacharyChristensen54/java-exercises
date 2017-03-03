package org.launchcode.java.demos.lc_prepwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ZachBurt on 3/2/2017.
 */
public class arrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums_to_sum = new ArrayList<>();
        nums_to_sum.add(1);
        nums_to_sum.add(2);
        nums_to_sum.add(3);
        System.out.println(arrayListPractice.listSum(nums_to_sum));

    }
    public static int listSum(ArrayList<Integer> al){
        int sum = 0;
        for (Integer num: al){
            sum += num;
        }
        return sum;
    }
}
