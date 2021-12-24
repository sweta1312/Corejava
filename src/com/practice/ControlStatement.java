package com.practice;

public class ControlStatement {
    public static void main(String[] args) {
        //if else
      /*  int x=10;
        int y=20;
        if(x>y)
        {
            System.out.println(false);
        }
        else
        {
            System.out.println(true);
        }*/
    /*    int f = 35, m = 60, p = 90, c = 55;

        if (m <= f) {
            System.out.println("Maths: Fail");
        }
        if (p <= f) {
            System.out.println("Physics: Fail");
        }
        if (c <= f) {
            System.out.println("Chemistry:Fail");

        } else {
            int a = (m + p + c) / 3;
            System.out.println(a);
            if (a < 35) {
                System.out.println("Failed");
            } else if (a <= 59) {
                System.out.println("Grade C");
            } else {
                if (a <= 69) {
                    System.out.println("Grade B");
                } else if (a > 70) {
                    System.out.println("Grade A");
                }
            }
        }*/
        int maths = 75, phy=64, chem=69;

        char grade;

        float avg = (maths + phy + chem)/3;

        if (avg<=59)

            grade = 'C';

        else if (avg<=69)

            grade = 'B';

        else

            grade = 'A';

        System.out.println(grade);
    }
}
