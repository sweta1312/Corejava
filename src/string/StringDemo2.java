package string;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "Java Programming Language";

        //1.Finding String is empty or not
        System.out.println(s.isEmpty());
        //2.Finding length of string
        System.out.println(s.length());

        String s1 = "";
        String s2 = "";
        String s3 = new String("");
        System.out.println(s1.isEmpty());//true
        System.out.println(s2.isEmpty());//true
        System.out.println(s3.isEmpty());//true

        System.out.println(s1.length());//0
        System.out.println(s2.length());//0
        System.out.println(s3.length());//0

        //printing string object
        System.out.println(s);

        //comparing two object
        String s4 = new String("abc");
        String s5 = new String("abc");
        String s6 = new String("Abc");

        System.out.println(s4 == s5);//false
        System.out.println(s4.equals(s5));//true

        System.out.println(s6 == s5);//false
        System.out.println(s6.equals(s5));//false

        //comparing String without case
        System.out.println(s5.equalsIgnoreCase(s6));//true

        //compare string lexicographically ,means after comparision method return difference bw string content
        System.out.println(s6.compareToIgnoreCase(s5));//0
        System.out.println(s5.compareTo(s6));

        String s7 = "abcde";
        String s8 = "abc";
        System.out.println(s7.compareTo(s8));//2

        //startsWith/endsWith()
        System.out.println(s.startsWith("Java"));//true
        System.out.println(s.startsWith("java"));//false
        System.out.println(s.startsWith("hari"));//false

        System.out.println(s.endsWith("Java"));//false
        System.out.println(s.endsWith("language"));//false
        System.out.println(s.endsWith("Language"));//true

        //print character at given index
        System.out.println(s.charAt(2));//v
        System.out.println(s.indexOf('P'));//5
        System.out.println(s.lastIndexOf('m'));//12
        System.out.println(s.indexOf("Language"));//17
        System.out.println(s.indexOf("hari"));//-1

        //substring()
        System.out.println(s.substring(5));//Programming Language
        System.out.println(s.substring(5, 15));//Programmin
        // System.out.println(s.substring(-5));//StringIndexOutOfBoundsException
        System.out.println(s.substring(5, 25));

        //concatenatinf new  string
        String s9 = "a";
        String s10 = s1 + "b";

        System.out.println(s1);//a
        System.out.println(s2);//ab
        System.out.println(s1 == s2);//false

        //concat()
        String s11 = "a";
        String s12 = s11.concat("bcd");
        System.out.println("s11:" + s11);//a
        System.out.println("s12:" + s12);//abcd

        //toLowerCase() toUppercase()
        String s13 = s12.toUpperCase();
        System.out.println(s13);//ABCD

        //replace a char with new char
        String s14 = s.replace('J', 'K');
        System.out.println(s14);//Kava Programming Language

        String s15 = s.replace("Kava", "Java");
        System.out.println(s15); //C
        System.out.println(s.equals(s15));//true
        System.out.println(s.equals(s14));//false

        String s16 = "Ha Ha Ha";
        String s17 = s16.replace("ha", "Hello");
        System.out.println(s16);//Ha Ha Ha
        System.out.println(s17);//Ha Ha Ha
        System.out.println(s16 == s17);//true

        //trim()-for deleting space
        String s18 = new String(" Java core Spring");
        String s19 = s18.trim();
        System.out.println(s18);
        System.out.println(s19);
        System.out.println(s18 == s19);//false

        //split()
        String b = "abc def ghi jkl";
        String[] arr = b.split(" ");
        System.out.println(arr.length);
       /* for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);//abc def ghi jkl
        }*/
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);//jkl ghi def abc
        }
        //contains()
        System.out.println(s.contains("Java"));//true


        //StringBuffer
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//16
        StringBuffer sb1=new StringBuffer("abc");
        System.out.println(sb1.capacity());//19


    }
}

