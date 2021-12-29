package fundamentalclasses;

public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "hari", 2);
        Student s2 = new Student(2, "ram", 4);
        Student s3 = new Student(3, "ravi", 12);
        Student s4 = new Student(3, "ravi", 12);
        System.out.println(s1.equals(s2));
        System.out.println(s4.equals(s3));
    }
}

