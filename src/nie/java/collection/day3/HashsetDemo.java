package nie.java.collection.day3;




import java.util.HashSet;

public class HashsetDemo {
    /*
    set接口  共同特点 不允许重复

    Hashset 无序(不是按照添加顺序排) 根据hash进行排序
    treeset  有序 按照元素进行排序  2 1 3
     */


    public static void main(String[] args) {
//        int[] a = {1, 2, 3};
        //[I@1b6d3586 默认调用object的tostring()    调用object类中的hashcode()

//        System.out.println(a);

        /*
        如果类中没有从写hashcode()   那么会调用object 类中的hashcode  对象值
         */

//        Student s = new Student();
//        System.out.println(s);



            /*
        向hashset添加元素时 如何确定重复元素

        底层双保险,既要提高效率,又要安全可靠
        首先会获得添加类容的hash值,判断hash值在集合中是否存在
        但是内容不相同时,hash值可能会相同,,也就不可靠
        在hash值相同时,会调用equal方法,比较类容是否相等

         */
        HashSet<Student> set = new HashSet<>();
        //如果类中没有从写hashcode()   那么会调用object 类中的hashcode()不会重复  算出对象的值
        Student s1 = new Student(101, "jin1");
        Student s2 = new Student(101, "jin1");
        Student s3 = new Student(103, "jin3");
        Student s4 = new Student(106, "jin4");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);






/*
        //位置为什么时无序的
        //添加时根据内容的hash值,在经过hash函数经过计算得到函数计算 得到在hash表中的储存位置

        //字符串 已经重写hashcode 重写了
        HashSet<String> set = new HashSet<>();
        set.add("ads");
        set.add("通话");
        set.add("ads");
        set.add("重地");
        set.add("ads");
        set.add("123");
        System.out.println(set);

*/

    }


}
