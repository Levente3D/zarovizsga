package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashMap;
import java.util.Map;

public class DigitsCounter {

    public int getCountOfDigits(){
        Map<Integer, Integer> getCountOfDigits = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (getCountOfDigits.containsKey(c)) {
                getCountOfDigits(c, getCountOfDigits.get(c) + 1);
            }
            else {
                getCountOfDigits.put(c, 1);
            }
        }
        System.out.println(getCountOfDigits);
    }


}
