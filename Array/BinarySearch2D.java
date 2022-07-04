package Array;

import java.util.*;

public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // nums.length
        int n = sc.nextInt();// nums[0].length
        int[][] nums = new int[m][n];
        int k = sc.nextInt();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                nums[i][j] = sc.nextInt();
        int row = 0;
        int col = n - 1;
        boolean contains = false;
        while (row != m && col != -1) {
            if (nums[row][col] == k) {
                contains = true;
                break;
            } else if (nums[row][col] > k)
                col--;
            else
                row++;
        }
        System.out.print(contains);
        sc.close();
    }
}