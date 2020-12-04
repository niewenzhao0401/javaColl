package nie.java.collection.day1;

import java.util.ArrayList;
import java.util.Collection;


/*
集合只能存储引用类型   默认是(object)

 */
public class List {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("asda");
        c.add("asda");
        c.add("asda");

        c.add(1);//此处自动装箱,,
        System.out.println(c);
        c.remove(2);
        System.out.println(c);
        System.out.println("as");
        System.out.println("as");
        System.out.println("as");
        System.out.println("as");
        System.out.println(c.contains(1));
    }
}
