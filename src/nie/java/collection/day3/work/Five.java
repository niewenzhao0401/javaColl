package nie.java.collection.day3.work;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
"aababcabcdabcde",获取字符串中每一个字母出现的次数要求
结果:a=5,b=4,c=3,d=2,e=1
 */
public class Five {
    public static void main(String[] args) {
        String str="aababcabcdabcde";
        char[] charStr=str.toCharArray();
        Map<Character,Integer> map=new TreeMap<>();
        for (int i = 0; i <charStr.length ; i++) {

            if (map.containsKey(charStr[i])){
                Integer val=map.get(charStr[i]);
                val++;
                map.put(charStr[i],val);
            }else {
                map.put(charStr[i],1);
            }

        }
        System.out.println(map);
    }
}
