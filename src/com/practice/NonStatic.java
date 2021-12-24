package com.practice;

public class NonStatic {
    public static void main(String[] args) {
    /*byte a=-50;
    byte b=20;
    byte result=(byte)(a+b);
        System.out.println(result);
        int m=612;
        byte n=(byte)m;
        char o=(char)n;
        System.out.println(o );*/

        //primitive to object
      /*  int i=100;
        Integer in=Integer.valueOf(i);
        System.out.println(in);
         byte b=100;
         Byte bt=Byte.valueOf(b);
        System.out.println(b);*/

        //object to primitive
  /*      int i=101;
        Integer i1=Integer.valueOf(i);
        int i2=i1.intValue();
        System.out.println(i2);*/

      //primitive to string
      /*  byte x=100;
        String s=Byte.toString(x); //primitive to string
        System.out.println(s);
       byte y=Byte.parseByte(s); //string to primitive
       System.out.println(y);*/

        //object to string
        long l=1000;
        Long x=Long.valueOf(l); //primitive to object
        String s=x.toString();//obj to string
        Long z=Long.valueOf(s);//string to object

    }
}
