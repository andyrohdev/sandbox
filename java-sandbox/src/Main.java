import java.util.*;

public class Main {



    public static void main(String[] args) {

        Main main = new Main();
        List<String> strings = new ArrayList<>(List.of("red", "yellow", "blue", "yellow", "blue", "red"));
        int[] nums = new int[]{5, 8, 11, 39, 200, 97};
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(main.makeMiddle(nums)));



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

    // Create a method called comboString that takes in two strings, a and b. Return a string of the form short+long+short, where short is the shorter of a and b and long is the longer of the two. You can assume the strings are different lengths, but they may be empty (length 0).
    //
    //For example:
    //
    //comboString("Hello", "hi") → "hiHellohi"
    //comboString("hi", "Hello") → "hiHellohi"
    //comboString("aaa", "b") → "baaab"

    public String comboString(String a, String b) {

        String shortS = "";
        String longS = "";

        if (a.length() >= b.length()) {
            shortS = b;
            longS = a;
        } else {
            shortS = a;
            longS = b;
        }

        return shortS + longS + shortS;
    }

    //Create a method called countXX that takes in a string called str. Return the number of "xx" in str. Instances of "xx" can overlap, so "xxx" contains "xx" twice.
    //
    //For example:
    //
    //countXX("abcxx") → 1
    //countXX("xxx") → 2
    //countXX("xxxx") → 3

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String check = str.substring(i, i+2);
            if (check.equals("xx")) {
                count += 1;
            }
        }
        return count;
    }

    //Create a method called array123 that takes in an integer array called nums. Return true if 1, 2, 3 appears in order, somewhere in nums. Otherwise, return false.
    //
    //For example:
    //
    //array123({1, 1, 2, 3, 1}) → true
    //array123({1, 1, 2, 4, 3}) → false
    //array123({1, 1, 2, 1, 2, 3}) → true

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    //Create a method called more14 that takes in an array of integers called nums. Return true if the number of 1s in nums is greater than the number of 4s in nums. Otherwise return false.
    //
    //For example:
    //
    //more14({1, 4, 1}) → true
    //more14({1, 4, 1, 4}) → false
    //more14({1, 1}) → true

    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1 += 1;
            }
            if (nums[i] == 4) {
                count4 += 1;
            }
        }

        return count1 > count4;
    }

    //Create a method called no4LetterWords that takes in an array of strings called strings. Return a List containing the elements of strings in the same order except for any that contain exactly 4 characters.
    //
    //For example:
    //
    //no4LetterWords( {"Train", "Boat", "Car"} ) →   ["Train", "Car"]

    //no4LetterWords( {"Red", "White", "Blue"} ) →   ["Red", "White"]
    public List<String> no4LetterWords(String[] strings) {
        List<String> returnArray = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() != 4) {
                returnArray.add(strings[i]);
            }
        }

        return returnArray;
    }

    //Create a method called sumOddsBetweenValues that takes in two integers start and end. Return the sum of the odd integers between start and end inclusive. You can assume end isn't less than start (but they may be equal).
    //
    //For example:
    //
    //sumOddsBetweenValues(0, 5) → 9
    //sumOddsBetweenValues(28,30) → 29

    //sumOddsBetweenValues(18, 18) → 0
    public int sumOddsBetweenValues(int start, int end) {

        int distance = end - start;
        int sum = 0;
        for (int i = 1; i <= distance; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        if (sum == 0) {
            return 0;
        }

        return start + sum;

    }

    public List<String> distinctValues(List<String> strings) {

        List<String> returnList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String word : strings) {
            map.putIfAbsent(word, 1);
        }

        for(String word : map.keySet()) {
            returnList.add(word);
        }

        return returnList;

    }

    // Create a method called array2List that takes in a string array called strings.
    // Return a List containing the elements of strings in the same order.
    // Avoid using a standard library method that does the conversion for you.

    public List<String> array2List(String[] strings) {

        List<String> returnList = new ArrayList<>();

        for(String word : strings) {
            returnList.add(word);
        }

        return returnList;

    }

    // Create a method called arrayInt2ListDouble that takes in an integer array called ints.
    // Divide each value in ints by 2, and return them in a List of Doubles.

    public List<Double> arrayInt2ListDouble(int[] ints) {

        List<Double> returnList = new ArrayList<>();

        for(int num : ints) {
            double quotient = (double) num / 2;
            returnList.add(quotient);
        }

        return returnList;

    }

    //Create a method called makeOutWord that takes in two strings, outword and word.
    // Return a new string where the word is in the middle of the outword string.
    // You can assume the length of outword is even.

    public String makeOutWord(String outward, String word) {

        String returnString = "";
        String upperhalf = outward.substring(0, (outward.length() / 2));
        // <<>> : Start at 0 index, length is 4 / 2 = 2, Index position 2. We need to offset by one.
        // After testing, I change my mind. No offset needed.
        String bottomhalf = outward.substring(outward.length() / 2);

        returnString += upperhalf;
        returnString += word;
        returnString += bottomhalf;

        return returnString;

    }

    // Create a method called makeMiddle that takes in an integer array nums.
    // Return a new array length 2 containing the middle two elements from nums.
    // You can assume the length of nums is even and 2 or more.

    public int[] makeMiddle(int[] nums) {

        int[] returnArray = new int[2];

        // 1 2 3 4 : First want to find the mid point. Size / 2 is 2. So the index position is 2 - 1 starting.

        int startingPointIndex = (nums.length / 2) - 1; // Should be 1.

        returnArray[0] = nums[startingPointIndex];
        returnArray[1] = nums[startingPointIndex + 1];

        return returnArray;

    }

}