package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
      try {
          FileInputStream fis = new FileInputStream("");
      }
      catch (FileNotFoundException e)
      {
         // e.printStackTrace();
          System.out.println("provide file path");
      }
      finally {
          System.out.println("finally block");
      }
    }
}
