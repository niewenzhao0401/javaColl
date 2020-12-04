package nie.java.collection.day2;

import java.util.ArrayList;

public class ArraylistDemo01 extends ArrayList {
    public static void main(String[] args) {

        ArraylistDemo01 list = new ArraylistDemo01();
        list.add("a");
        list.add("s");
        list.add("z");
        list.add("v");
        list.add("f");
        list.removeRange(0,3);//删除指定区间
        System.out.println(list);
    }
}
