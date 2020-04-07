package is_valid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    private static Map<Character,Character> characterMap = new HashMap<>();
    public static void main(String[] args) {
        String s = "){";
        Main main = new Main();
        System.out.println(main.isValid(s));
    }
    public boolean isValid(String s) {
        if (s.isEmpty())
            return true;
        if (s.length() == 1)
            return false;
        iniMap();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                stack.push(aChar);
            }

            if (aChar == ')' || aChar == '}' || aChar == ']') {
                if (stack.isEmpty() || aChar != characterMap.get(stack.pop()))
                    return false;
            }
        }
        if (!stack.isEmpty())
            return false;
        return true;
    }

    private static void iniMap() {
        characterMap.put('(',')');
        characterMap.put('{','}');
        characterMap.put('[',']');
    }
}
