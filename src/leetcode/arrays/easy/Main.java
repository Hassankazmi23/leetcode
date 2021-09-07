package leetcode.arrays.easy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4, 0, 0, 0, 0};
        int m = 4;
        int arr2[] = {1,2, 5, 6};
        int n = 4;
        Merge merge = new Merge();
        int result[] = merge.merge(arr, m, arr2, n);
        for(Integer num: result) {
            System.out.print(num+",");
        }
    }
}
