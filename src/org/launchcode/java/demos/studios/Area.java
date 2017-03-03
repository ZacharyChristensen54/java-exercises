package org.launchcode.java.demos.studios;

import java.util.Scanner;

/**
 * Created by ZachBurt on 2/27/2017.
 */
public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Radius: ");
        double radius = in.nextFloat();
        double area = Math.PI * radius * radius;
        System.out.println("The area is: " + area);
    }
}
