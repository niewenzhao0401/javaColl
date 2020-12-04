package nie.java.collection.day3;

import java.util.*;

public class MapDemo {
    /*
    Map: 双列存储  键-值
    键不重复,值可以重复
    hashMap
    treeMap
    hashTable
     */

    /*

    键去重复 hashcode()方法和equals();
    如果键重复,值覆盖以前的
    允许一个键可以为空,

     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("b", "bss");
        map.put("a", "b");
        map.put("c", "c");
        map.put("s", "s");
        map.put("q", "q");
//        map.clear();
//        map.remove("a");
//        System.out.println( map.get("s"));
//        System.out.println( map.containsKey("s"));
//        System.out.println( map.containsValue("s"));
//        System.out.println(map.values());
//        System.out.println(map);
//        Collection<String> s=map.values();
//        System.out.println(s);
//      System.out.println(map.get("b"));
        System.out.println(map);


        Collection<String> s = map.values();
        System.out.println(s);
        System.out.println("____");


        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()){
            String integer=iterator.next();
            System.out.println(integer);
        }
        System.out.println("____");
        //遍历1
        Set<String> key = map.keySet();
        for (String key1 : key) {
//            System.out.print(key1);
            System.out.println(key1 + "====" + map.get(key1));
        }



        System.out.println("+++++++++++++++++++++++++++++++++++");
        //遍历二
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entrie : entries) {
            System.out.println(entrie);

        }

    }
}
