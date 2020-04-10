package generate_parenthesis;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> resultList = new ArrayList<>();
    public static void main(String[] args) {
        Main main = new Main();
        List<String> strings = main.generateParenthesis(3);
        strings.forEach(System.out::println);
    }
    public List<String> generateParenthesis(int n) {
        generateString("",0,0,n);
        return resultList;

    }
    public void generateString(String cur,int open,int close,int max) {
        if (cur.length() == max * 2) {
            resultList.add(cur);
            return;
        }
        if (open < max)
            generateString(cur + "(",open + 1,close,max);
        if (close < open)
            generateString(cur + ")",open,close + 1,max);
    }
}
