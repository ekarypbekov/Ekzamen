package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle crl = new Circle(8);
        crl.printCircleInfo();

        System.out.println("Circle area :" + crl.getCircleArea());

        int size = 10, count = 0;
        Circle[] array = new Circle[size];
        for (int i = 0; i < array.length; i ++){
            array [i] = new Circle (i);
            if (array[i].getRadius() % 3 == 0){
                count ++;
            }
        }
        System.out.println("Кол- во кругов " + count);
    }
}
