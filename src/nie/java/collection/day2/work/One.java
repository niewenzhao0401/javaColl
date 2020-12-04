package nie.java.collection.day2.work;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class One {
    public static void main(String[] args) {


        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println("ArrayList排序前");
        System.out.println(simpleDateFormat.format(date1));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("dasda");
        }
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println("ArrayList排序后");
        System.out.println(simpleDateFormat1.format(date2));

        System.out.println("++++++++++++++++++++++");

        Date date3 = new Date();
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println("LinkedList排序前");
        System.out.println(simpleDateFormat3.format(date3));
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            linkedList.add("dasda");
        }
        Date date4 = new Date();
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
        System.out.println("LinkedList排序后");
        System.out.println(simpleDateFormat4.format(date4));
    }
}
