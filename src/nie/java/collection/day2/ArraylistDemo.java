package nie.java.collection.day2;

import java.util.ArrayList;
import java.util.Comparator;

public class ArraylistDemo {
    public static void main(String[] args) {

        ArrayList list1=new ArrayList();
        list1.add("w");
        list1.add("e");
        list1.add("r");
        list1.add("t");
        list1.add(0,"a");
        System.out.println(list1);
        System.out.println(list1.get(2));
        list1.remove(2);//通过索引删除
        System.out.println(list1);
        //set
        //  用指定的元素替换此列表中指定位置的元素。
        list1.set(2,"b");
        System.out.println(list1);


        list1.sort(new StringSort());
        System.out.println(list1);
        //subList
        //removerRange
    }
}
