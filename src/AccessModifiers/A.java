package AccessModifiers;

public class A {
    private int a=10;
    int b=20;
    protected int c=30;
    public int d=40;
    public static void main(String[] args) {
    A obj=new A();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
