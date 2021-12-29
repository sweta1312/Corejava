package fundamentalclasses;

public class Student {
    public int sno;
    public String sname;
    public int std;

    public Student(int sno, String sname, int std) {
        this.sno = sno;
        this.sname = sname;
        this.std = std;
    }

    //overriding equal methods
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else{
            if(obj instanceof Student){
                Student s=  (Student)obj;
                return this.sno == s.sno && this.sname == s.sname
                        && this.std == s.std;
            } else{
                return false;
            }
        }


    }


}
