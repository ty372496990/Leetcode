package int_to_roman;

import java.util.Scanner;

public class Main {
    int[] nums = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int i = in.nextInt();
            System.out.println(main.intToRoman(i));
        }
    }
    public String intToRoman(int num) {
        int length = nums.length;
        StringBuilder stringBuilder = new StringBuilder();
        int index = length - 1;
        while (index >= 0) {
            while (num >= nums[index]){
                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            index --;
        }

        return stringBuilder.toString();
    }
}
