package Encapsulation;

public class Test {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.setFirstName("null");
        c.setsecondName("verma");
        c.setcreditCard("12345");
        System.out.println(c.getFirstName());
        System.out.println(c.getSecondName());
        System.out.println(c.getcreditCard());
    }
}
