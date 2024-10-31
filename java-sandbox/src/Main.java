import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Main main = new Main();

        System.out.println("Hello world!");
        System.out.println(Arrays.toString(main.fizzArray(1)));


    }

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

    public boolean double23(int[] nums) {
        if (nums.length != 2) {
            return false;
        }

        return (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3);

    }

    public int[] fix23(int[] nums) {
//        int[] newArray = new int[3];
//        boolean nextNum0 = false;
//        for (int i = 0; i < nums.length; i++) {
//            if (i < nums.length - 1) {
//                if(!nextNum0) {
//                    if (nums[i] == 2 && nums[i + 1] == 3) {
//                        newArray[i] = 2;
//                        newArray[i + 1] = 0;
//                        nextNum0 = true;
//                    } else {
//                        newArray[i] = nums[i];
//                    }
//                } else {
//                    nextNum0 = false;
//                }
//            } else if (nextNum0) {
//                break;
//            } else {
//                newArray[i] = nums[i];
//            }
//        }
//
//        return newArray;

        int[] newArray = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                newArray[i + 1] = 0;
            }
        }
        return newArray;
    }

    public int[] fizzArray(int n) {
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = i;
        }

        return newArray;
    }

}