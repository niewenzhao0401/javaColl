package nie.java.collection.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class TypeDemo {
    /*
    如果使用object作为类型,可以使用任何数据类型
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("adasd");
        arrayList.add(0);
        arrayList.add(true);
        for (Object obj : arrayList) {
            //具体操作的时候需要向下转型..类型不匹配
            if (obj instanceof Iterator) {
                String str = (String) obj;
            }
        }
        Iterator iterator1 = arrayList.iterator();
    }
}
