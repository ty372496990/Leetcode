package letter_combinations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String,String> map = new HashMap<>();
    private  List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        String s = "23";
        Main main = new Main();
        main.letterCombinations(s).forEach(System.out::println);
    }
    public List<String> letterCombinations(String digits) {
        iniMap();
        if (digits.length() != 0)
            backtrack("", digits);
        return result;
    }
    private void backtrack(String combination,String next_digits) {
        if (next_digits.length() == 0) {
            result.add(combination);
        } else {
            String substring = next_digits.substring(0, 1);
            String letters = map.get(substring);
            for (int i = 0; i < letters.length(); i++) {
                String letter = letters.substring(i, i + 1);
                backtrack(combination + letter,next_digits.substring(1));
            }
        }
    }

    private void iniMap() {
        map.put("1","");
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
    }

}
