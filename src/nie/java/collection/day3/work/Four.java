package nie.java.collection.day3.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1930", "乌拉圭");
        map.put("1934", "意大利");
        map.put("1938", "意大利");
        map.put("1950", "乌拉圭");
        map.put("1954", "西德");
        map.put("1958", "巴西");
        map.put("1962", "巴西");
        map.put("1966", "英格兰");
        map.put("1970", "巴西");
        map.put("1974", "西德");
        map.put("1978", "阿根廷");
        map.put("1982", "意大利");
        map.put("1986", "阿根廷");
        map.put("1990", "西德");
        map.put("1994", "巴西");
        map.put("1998", "法国");
        map.put("2002", "巴西");
        map.put("2006", "意大利");
        map.put("2012", "西班牙");
        map.put("2016", "德国");
        map.put("2018", "法国");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        String str = scanner.nextLine();
        if (map.containsKey(str) == false) {
            System.out.println("该年没有举办世界杯！");
        } else {
            System.out.println("该年的世界杯冠军是：" + map.get(str));
        }

        System.out.println("请输入球队的名字：");

        String str1=scanner.nextLine();
        if(map.containsValue(str1)==true)
        {
            System.out.println(str1+"夺冠的年份有：");
            for(String a:map.keySet())
            {
                if(map.get(a).contains(str1))
                {
                    System.out.print(a+"\t");

                }
            }




        }

    }
}
