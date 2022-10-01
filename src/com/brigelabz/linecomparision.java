package com.brigelabz;

import java.util.Scanner;

public class linecomparision {
    public static int lineLengthCal() {
    int x1,y1,x2,y2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the co-ordinates of line!!: x1,y1,x2,y2");
    x1 = scanner.nextInt();
    y1 = scanner.nextInt();
    x2 = scanner.nextInt();
    y2 = scanner.nextInt();
    int lineLength = (int)Math.sqrt(Math.pow((x2-x1), 2)
            + Math.pow((y2-y1), 2) );
    return lineLength;

}
    public static void equalityCheck
            (int lineOneLength , int lineTwoLength ) {
        if(lineOneLength == lineTwoLength ) {
            System.out.println("Lines are Equal");
        }
        else {
            System.out.println("Lines are not Equal");
        }
    }

    public static void main(String[] args) {
        int lineOneLength = lineLengthCal();
        int lineTwoLength = lineLengthCal();
        System.out.println("The length of line 1 is: "+lineOneLength);
        System.out.println("The length of line 2 is: "+lineTwoLength);
        equalityCheck(lineOneLength,lineTwoLength);

    }

}













