package nie.java.collection.day3LL.day3L;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNum()-o2.getNum();
    }
}
