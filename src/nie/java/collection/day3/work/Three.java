package nie.java.collection.day3.work;

import java.util.HashMap;
import java.util.Map;

public class Three {
    public static void main(String[] args) {
        String[] str1=new String[]{"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] str2=new String[]{"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> map=new HashMap<>();
        for (int i = 0; i <str1.length ; i++) {
            map.put(str1[i],str2[i]);
        }
        System.out.println(map);
    }
}
