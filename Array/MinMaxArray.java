package Array;

import java.util.*;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int max = a[0];
        int min = a[0];
        int i = 0;
        int j = n - 1;
        while (i < j) {
            // we make n/2 comparisons
            min = Math.min(a[i], a[j]);
            max = Math.max(a[i], a[j]);
            i++;
            j--;
        }
        System.out.print(max + " " + min);
        sc.close();
    }
}