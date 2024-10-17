import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main {



    public static void main(String[] args) {

        Main main = new Main();

        System.out.println("Hello world!");
        int[] nums = new int[]{1, 1, 2, 2, 1};
        System.out.println(main.noTriples(nums));


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

    // Create a method called swapEnds that takes in an integer array nums. Swap the first and last elements in nums. Return the modified array. You can assume the length of nums is at least 1.
    //
    // For example:
    //
    //swapEnds({1, 2, 3, 4}) → {4, 2, 3, 1}
    //swapEnds({1, 2}) → {2, 1}
    //swapEnds({8}) → {8}

    public int[] swapEnds(int[] nums) {
        int[] returnArray = nums.clone();
        returnArray[0] = nums[nums.length - 1];
        returnArray[returnArray.length - 1] = nums[0];
        return returnArray;
    }

    // Create a method called noTriples that takes in an integer array nums. A triple is a value appearing 3 times in a row. Return true if there are no triples in nums. Otherwise return false.
    //
    //For example:
    //
    //noTriples({1, 1, 2, 2, 1}) → true
    //noTriples({1, 1, 2, 2, 2, 1}) → false
    //noTriples({1, 1, 1, 2, 2, 2, 1}) → false

    public boolean noTriples(int[] nums) {
        boolean noTriples = true;
        
        for (int i = 0; i < nums.length; i++) {

            //Next time consider moving this bounds check into the nums.length in the loop.
            if (i == nums.length - 2) {
                break;
            }

            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                noTriples = false;
                break;
            }
            
        }

        return noTriples;
    }

    //Create a method called evenlySpaced that takes in three integers, a, b, and c. Return true if a, b, and c are evenly spaced, so the difference between the lowest value and the middle value is the same as the difference between the middle value and the highest value. Otherwise, return false.
    //
    //For example:
    //
    //evenlySpaced(2, 4, 6) → true
    //evenlySpaced(4, 6, 2) → true
    //evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {
        int[] nums = new int[]{a, b, c};
        Arrays.sort(nums);

        int lowest = nums[0];
        int middle = nums[1];
        int highest = nums[2];

        if (highest - middle == middle - lowest) {
            return true;
        } else {
            return false;
        }
    }

    //Create a method called arrayFront9 that takes in an integer array called nums. Return true if one of the first 4 elements in nums is a 9. The length of nums may be less than 4.
    //
    //For example:
    //
    //arrayFront9({1, 2, 9, 3, 4}) → true
    //arrayFront9({1, 2, 3, 4, 9}) → false
    //arrayFront9({9, 0}) → true

    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i < 5 && nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    //Create a method called foundIntTwice that takes in a List of integers called nums and an integer value. Return true if value appears two or more times in nums. Otherwise return false.
    //
    //For example:
    //
    //foundIntTwice( [5, 7, 9, 5, 11], 5 ) → true
    //foundIntTwice( [6, 8, 10, 11, 13], 8 ) → false
    //foundIntTwice( [9, 23, 44, 2, 88, 44], 44 ) → true

    public boolean foundIntTwice(List<Integer> nums, int number) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            hashMap.put(nums.get(i), hashMap.getOrDefault(nums.get(i), 0) + 1);
        }
        if (hashMap.get(number) >= 2) {
            return true;
        }
        return false;
    }

}