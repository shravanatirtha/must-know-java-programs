package Array;

import java.util.*;

public class LeastDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++)
            min = Math.min(min, Math.abs(nums[i] - nums[i - 1]));
        System.out.print(min);
        sc.close();
    }

}