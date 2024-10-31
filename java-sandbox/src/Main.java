import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {



    public static void main(String[] args) {

        Main main = new Main();

        int[] nums = new int[]{1, 6, 4, 12, 7, 3, 2, 10};
        System.out.println("Hello world!");
        System.out.println(Arrays.toString(main.insertionSort(nums)));


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

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] selectiveSort(int[] nums) {
        int[] array = nums.clone();

        System.out.println("Cloned Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[smallestIndex];
            array[smallestIndex] = temp;

            System.out.println("Number Replaced: " + Arrays.toString(array));
        }

        return array;
    }

    public int[] insertionSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            System.out.println("Nums: " + Arrays.toString(nums));
            int key = nums[i];
            int j = i - 1;

            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
                System.out.println(Arrays.toString(nums));

            }
            nums[j + 1] = key;
        }
        return nums;
    }


}