package nie.java.collection.day2.work;

import java.util.ArrayList;
import java.util.Random;

public class two {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            Integer a = (random.nextInt(19) + 1);
            if (!integerList.contains(a)) {
                integerList.add(a);
                i++;
            }
        }
        System.out.println(integerList);
    }
}