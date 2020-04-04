package longest_common_substring;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String strOne = "abcdefg";
        String strTwo = "adefgwgeweg";
        String result = main.getLongestSubString(strOne, strTwo);
        System.out.println(result);
    }

    public String getLongestSubString(String a,String b) {
        if(a == null || b == null)
            return null;
        if(a.equals("") || b.equals(""))
            return null;
        String max = "";
        String min = "";
        if(a.length() > b.length()) {
            min = b;
            max = a;
        }else {
            max = b;
            min = a;
        }
        String current = "";
        String result = "";
        int maxLen = 0;
        for (int len = 1; len <= min.length(); len++) {
            for (int start = 0; start < min.length(); start++) {
                int end = start + len;
                if(end > min.length())
                    break;
                if(end == start)
                    current = String.valueOf(min.charAt(end));
                else{
                    current = min.substring(start,end);
                }
                if(max.contains(current) && current.length() > maxLen) {
                    maxLen = current.length();
                    result = current;
                }
            }
        }
        return result;
    }
}
