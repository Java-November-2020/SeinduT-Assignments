import java.util.ArrayList;
import java.util.Arrays;

public class BasicsController {
    public static void main(String[] args) {
        Basics stuff = new Basics();

        stuff.Oneto255();

        stuff.OddNumbers();

        stuff.ArraySum();

        int arr[] = new int [] {1,5,11,8,13};
        stuff.Iterate(arr);

        int pos[] = new int [] {12,5,6,4};
        int neg[] = new int [] {-5,-9,-12,-3};
        int mix[] = new int [] {5,7,0,-21,-5};
        stuff.FindMax(pos);
        stuff.FindMax(neg);
        stuff.FindMax(mix);

        int  avg[] = new int [] {2,6,9,14};
        stuff.Average(avg);

        stuff.OddArray();

        int arr1[] = new int[] {2,5,3,8,9};
        int y = 4;
        int greater = stuff.GreaterThen(arr1, y);
        System.out.println(greater);

        ArrayList<Integer> arr2 = new ArrayList<Integer>(
            Arrays.asList(1,3,-5,0)
        );
        ArrayList<Integer> list = stuff.SquaredValues(arr2);
        System.out.println(list);

        ArrayList<Integer> arr3 = new ArrayList<Integer>(
            Arrays.asList(-1,3,-5,7)
        );
        ArrayList<Integer> noNegs = stuff.NoNegatives(arr3);
        System.out.println(noNegs);

        int arr4[] = new int [] {2,-3,0,5,13};
        stuff.MaxMinAvg(arr4);

        ArrayList<Integer> arr5 = new ArrayList<Integer>(
            Arrays.asList(3,-5,0,6,9)
        );
        stuff.ShiftingVals(arr5);
    }
}