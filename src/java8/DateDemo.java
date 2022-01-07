package java8;


import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Date;


public class DateDemo {
    public static void main(String[] args) {
       /* Date date=new Date();
        System.out.println(date);*/

        //Getting Currnt Date
        LocalDate now= LocalDate.now();
        System.out.println(now);
        //Getting specific date using Of method
        LocalDate date=LocalDate.of(2022,01,06);
        System.out.println(date);
        //
    }


}
