package roman_to_int;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    int[] nums = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
//    String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    private static Map<Character,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.romanToInt("D"));
    }
    public int romanToInt(String s) {
        initMap();
        char[] chars = s.toCharArray();
        if (chars.length == 1) {
            return map.get(chars[0]);
        }
        int sum = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (map.get(chars[i]) >= map.get(chars[i + 1])) {
                sum += map.get(chars[i]);
            } else if (map.get(chars[i]) < map.get(chars[i + 1])) {
                sum += (map.get(chars[i + 1]) - map.get(chars[i]));
                i++;
            }
        }
        if (map.get(chars[chars.length - 2]) >= map.get(chars[chars.length - 1]))
            sum += map.get(chars[chars.length - 1]);
        return sum;
    }

    private static void initMap() {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
}
