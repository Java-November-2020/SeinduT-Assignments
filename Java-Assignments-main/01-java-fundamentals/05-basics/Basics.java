import java.util.ArrayList;

public class Basics{

    public static void Oneto255() {
        for(int i = 0; i <= 255; i++)
        System.out.println(i);
    }

    public static void OddNumbers() {
        for(int i = 0; i <= 255; i++) {
            if(i % 2 != 0)
                System.out.println(i);
        }
    }

    public static int GetSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public static int ArraySum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + "Sum: " + sum); 
        }
        return sum;
    }

    public static void Iterate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int FindMax (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val: arr) {
            if (val < max)
                max = val;
        }
        return max;
    }

    public static int FindMin (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val: arr) {
            if (val < min)
                min = val;
        }
        return min;
    }

    public static double Average(int[] nums) {
        int sum = GetSum(nums);
        double avg = (double)sum/nums.length;
        System.out.println("Sum: " + sum + "Average: " + avg);
        return avg;
    }

    public static ArrayList<Integer> OddArray() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i <= 255; i++) {
            if (i % 2 != 0)
                nums.add(i);
        }
        return nums;
    }

    public static int GreaterThen(int[] arr, int y) {
        int total = 0;
        for (int num: arr) {
            if (num > y)
                total++;
        }
        return total;
    }

    public ArrayList<Integer> SquaredValues(ArrayList<Integer> arr) {
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i) * arr.get(i);
            arr.set(i, temp);
        }
        return arr;
    }

    public ArrayList<Integer> NoNegatives(ArrayList<Integer> val) {
        for (int i = 0; i < val.size(); i++) {
            if (val.get(i) < 0)
                val.set(i, 0);
        }
        return val;
    }

    public static void MaxMinAvg(int[] nums) {
        int min = FindMin(nums);
        int max = FindMax(nums);
        double avg = GetSum(nums);
        System.out.println("Max: " + max + "Min: " + min + "Average: " + avg);
    }

    public static void ShiftingVals(ArrayList<Integer> arr) {
        int num = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            if (i == arr.size()-1) {
                arr.set(i,0);
            }
            else 
                num = arr.get(i+1);
                arr.set(i, num);
        }
        System.out.println(arr);
    }
}