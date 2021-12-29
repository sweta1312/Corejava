package string;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        String s3 = "a";
        String s4 = "b";

        String s5 = new String("a");
        String s6 = new String("a");

        String s7 = "ab";
        String s8 = s1 + "b";
        String s9 = "a" + "b";

        System.out.println(s1==s2);//true
      System.out.println(s1==s3);//true
       System.out.println(s4==s3);//false
        System.out.println(s5==s6);//false
        System.out.println(s7==s8);//false
        System.out.println(s7==s9);//true
        System.out.println(s8==s9);//false

    }
}
