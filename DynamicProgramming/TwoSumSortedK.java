package DynamicProgramming;

import java.util.*;

public class TwoSumSortedK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        twoSumSorted(nums, n, k);
        sc.close();
    }

    static void twoSumSorted(int[] nums, int n, int k) {
        ArrayList<Integer> map = new ArrayList<>();
        for (int i = 0; i < n; i++)
            map.add(nums[i]);
        for (int i = 0; i < n; i++) {
            if (map.contains(k - nums[i]) && map.indexOf(k - nums[i]) != i) {
                System.out.print(i + " " + map.indexOf(k - nums[i]));
                break;
            }
        }
    }
}
