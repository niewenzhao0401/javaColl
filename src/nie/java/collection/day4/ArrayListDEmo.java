package nie.java.collection.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDEmo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("a");
        list1.add("a");
        list1.add("a");
        list1.add("a");
        list1.add("w");
        list1.add("t");
        ArrayList<String> list = new ArrayList<>();
//        list.add("c");
        list.add("d");
        list.add("n");
        list.add("y");
        list.add("a");
        list.add("w");
        list.add("t");
/*
        //排序
        Collections.sort(list);
        //二分搜索
        System.out.println(Collections.binarySearch(list,"a"));*/

//        Collections.addAll(list,"t","i","p","d");
        System.out.println(list);
        //原数组大现在的数组 就会报错
        Collections.copy(list1,list);
        System.out.println("list1\t"+list1);

    }
}
