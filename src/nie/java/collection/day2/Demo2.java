package nie.java.collection.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Demo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");

        //返回object类型
        Object[] b = c.toArray();


        Collection<String> c1 = new ArrayList<>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");
        //返回指定类型

        //强行转换
//        Integer[] s = (Integer[]) c1.toArray();

        String[] s1 = c1.toArray(new String[c1.size()]);

        test(1,2,3,323,232,32,3,23);

    }
        //可变长度参数,本质一个数组,只能有一个,           多个就 必须放在后面
        public  static  void test(int b,int c,int...a){
            System.out.println(a);
            System.out.println(Arrays.toString(a));
            System.out.println(b);
            System.out.println(c);
        }





    }

