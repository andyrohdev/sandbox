import java.lang.reflect.Array;

public class Main {



    public static void main(String[] args) {

        Main main = new Main();

        System.out.println("Hello world!");

        System.out.println(main.makeLast([]);


    }

    public 

    public int[] makeLast(int[] nums) {

        int newSize = nums.length * 2;

        int[] newArray = new int[newSize];

        newArray[newArray.length- 1] = nums[nums.length - 1];

        return newArray;
    }

    public String firstTwo(String str) {
        if (str.length() <= 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public int arrayCount9(int[] nums) {
        int count9 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count9 = count9 + 1;
            }
        }

        return count9;
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String extraEnd(String str) {
        String repeatedString = str.substring(str.length() - 2);
        return repeatedString + repeatedString + repeatedString;
    }

}