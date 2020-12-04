package nie.java.collection.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("w");
        list1.add("e");
        list1.add("r");
        list1.add("t");
        list1.add(0, "a");
        list1.add(0, "a");
        //for循环进行遍历
        //增删后   集合长度发生变化   i--   一种向后增长,,,索引和长度不匹配

        for (int i = 0; i < list1.size(); i++) {
            list1.remove(i);
        }
        System.out.println(list1);


/*
增强for循环,不允许遍历时堆元素进行操作
如果进行操作(删除),会 报错ConcurrentModificationException
如果执意删除的话  操作依次后    就必须的终止break;否则会抛出异常

        for (Object obj:list1){
//            System.out.println(obj);
            if (obj.equals("a")){
                list1.remove(obj);

            }
        }*/

        System.out.println(list1);
        Iterator it = list1.iterator();
        //hasnext()检测迭代器中是否有元素
        while (it.hasNext()) {
            Object obj = it.next();
            if ("a".equals(obj)) {
                it.remove();
            }
        }
        System.out.println(list1);

    }

}
