package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Object> set=new LinkedHashSet<>();
        set.add("XYZ");
        set.add("sdf");
        set.add("dff");
        set.add("XYZ");
        set.add("sdf");
        set.add(1);
        System.out.println(set);
    }
}
