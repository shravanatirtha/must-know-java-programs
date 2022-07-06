package Array; //user defined package

// searching an element in the array

import java.util.*; // system package

public class BinarySearch { // main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // instanceName.methodName
        int[] nums = new int[n]; // size is must
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt(); // search element
        System.out.print(binarySearch(n, nums, k));
        sc.close();
    }

    static int binarySearch(int n, int[] nums, int k) {
        // linear search - unsorted array
        /*
         * for (int i = 0; i < n; i++) {
         * if (nums[i] == k) {
         * index=i; return i;
         * break;
         * }
         * }
         */
        // binary search - sorted array
        int left = 0;
        int right = n - 1;
        for (int i = 0; i < n; i++) {
            int mid = (left + (right - left)) / 2;
            if (nums[mid] == k)
                return mid;
            else if (k > nums[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
