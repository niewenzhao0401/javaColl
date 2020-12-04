package nie.java.collection.day2;

import java.util.Comparator;

public class StringSort implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
