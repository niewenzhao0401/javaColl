package nie.java.collection.day3;

import java.util.ArrayList;

/*
泛型
泛指一种类型,类型不确定,,,可以以参数的形式进行传递
必须是 引用数据类型,可以有多个,
如果没有给具体的类型,默认为OBJECT
 */


/*
明确数据类型
 */
public class TypeDemo01<A> {
    A ob;

    void test(A ob) {
        return;
    }

    /*
    如果使用object作为类型,可以使用任何数据类型
     */
    public static void main(String[] args) {
        TypeDemo01<String> typeDemo01 = new TypeDemo01<>();
        typeDemo01.test("a");
        typeDemo01.test("a");
//        typeDemo01.test(12);
        //前面写 必须写 string    后面的没必要写
        ArrayList<String> arrayList = new ArrayList<>();
    }
}
