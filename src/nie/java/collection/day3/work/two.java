package nie.java.collection.day3.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class two {
    public static void main(String[] args) {
        Random random = new Random();
        Integer a;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i <16 ; i++) {
            integers.add(i);
        }


        for (int i = 1; i <= 4; i++) {

            System.out.print(i + "组:");
            for (int j = 0; j < 4; j++) {
                a = integers.get(random.nextInt(integers.size()));
                System.out.print("\t"+a);
                integers.remove(a);
            }
             System.out.println();
        }
    }
}


