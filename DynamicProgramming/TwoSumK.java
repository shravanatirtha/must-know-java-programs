package DynamicProgramming;

//Given a sorted integer array and an integer k, find two numbers which sum upto k.
import java.util.*;

public class TwoSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        twoSum(nums, n, k);
        sc.close();
    }

    static void twoSum(int[] nums, int n, int k) {
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                System.out.print(nums[left] + " " + nums[right]);
                break;
            } else if (nums[left] + nums[right] < k)
                left++;
            else
                right--;
        }
    }
}
