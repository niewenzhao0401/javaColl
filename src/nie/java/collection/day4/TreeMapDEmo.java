package nie.java.collection.day4;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMapDEmo {
    /*
    按照键的自然顺序进行排序,,
    按照类的类型,所属类必须使用排序接口
     */
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("b", "bss");
        treeMap.put("a", "b");
        treeMap.put("c", "c");
        treeMap.put("s", "s");
        treeMap.put("q", "q");
        System.out.println(treeMap);


        //Hashtable   底层实现用哈希表, 单链表     线程安全
        Hashtable<String, String> table = new Hashtable<>();
        //hash 相同   内容不同   通过链表的进行存储    解决       哈希冲突

        table.put("c", "c");
        table.put("a", "b");
        table.put("c", "c");
        table.put("c", "c");
        System.out.println(table);
    }
}
