package nie.java.collection.day3L;
import java.util.TreeSet;

public class HashsetDemo {

    public static void main(String[] args) {
        //创建集合对象
        //TreeSet(Comparator<? super E> comparator)
        // 构造一个新的空 TreeSet，它根据指定比较器进行排序。
        TreeSet<Student> ste = new TreeSet<>(new MyComparator());
        Student s1 = new Student(1, "jjj");
        Student s2 = new Student(1, "jjj");
        Student s3 = new Student(2, "jj11");
        Student s4 = new Student(3, "j23j");
        Student s5 = new Student(4, "jj123");
        ste.add(s1);
        ste.add(s2);
        ste.add(s3);
        ste.add(s4);
        ste.add(s5);
        System.out.println(ste);

    }
}
