package nie.java.collection.day2.work;

import java.util.ArrayList;
import java.util.Iterator;

public class Three {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("qwqw");
        arrayList.add("qwqw");
        arrayList.add("qwwww");
        arrayList.add("qwwww");
        arrayList.add("qwq");
        arrayList.add("qw");
        arrayList.add("qqw");
        arrayList.add("ewqw");
        System.out.println(arrayList);

        ArrayList newarray = new ArrayList();
        Iterator it =arrayList.iterator();
        while (it.hasNext()){
            Object str=it.next();
            if (!newarray.contains(str)){
                newarray.add(str);
            }

        }
        System.out.println(newarray);
    }
}
