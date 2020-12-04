package nie.java.collection.day3;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /*
        treeSet
        不可以储存重复元素
        有序(按照内容自然序列排序)  数据类型
        底层是红黑树

        treeset 排序实现Comparable接口 或者重写compareTo 进行排序
         */

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(2);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        System.out.println(integers);

    /*
    重写 添加元素 比较元素大小
    //用哪个属性比较 那个属性不能重复
     */
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student(101, "jin1");
        Student s2 = new Student(101, "jin1");
        Student s3 = new Student(103, "jin3");
        Student s4 = new Student(6, "jin4");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);
    }
}
