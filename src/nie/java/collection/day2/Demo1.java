package nie.java.collection.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");


        Collection cd = new ArrayList();
        cd.add("a");
        cd.add("b");
        cd.add("c");
        cd.add("d");
        cd.add("e");;
//        c.add("b");
//        c.add("c");
//        c.add("d");d
//        c.add("e");
//        cd.add("b");
//        cd.add("c");
//        cd.add("d");

//
//        c.addAll(cd);
//        System.out.println(c.containsAll(cd));
//        System.out.println(c);
//        c.removeAll(cd);//删除相同的
//        System.out.println(c);


        //retainAll(Collection<?> c)
        //仅保留此列表中包含在指定集合中的  元素
        //取lan
        //从此列表中删除其中不包含在指定集合中的所有元素。
        //取两个集合中交集,跟原集合内容不变返回flase..改变返回ture
        System.out.println(c.retainAll(cd));

        /*
        条件删除
        相当于过滤器
         */
//        System.out.println(c.removeIf(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return o.equals("b");
//            }
//        }));



    }
}
