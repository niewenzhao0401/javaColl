package nie.java.collection.day3;

import java.util.Iterator;
import java.util.TreeSet;

public class SetforDemo {
    public static void main(String[] args) {
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



        for (Integer a:integers){
            System.out.println(a);
        }
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }

}
