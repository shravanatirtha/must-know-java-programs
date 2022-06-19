package Array;

import java.util.*;

public class LargestPossibleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(largestPossibleNumber(num));
        sc.close();
    }

    static int largestPossibleNumber(int num) {
        char[] c = Integer.toString(num).toCharArray();
        int n = c.length;
        if (n == 1)
            return num;
        Arrays.sort(c);
        String res = "";
        for (int i = n - 1; i >= 0; i--)
            res += c[i];
        return Integer.parseInt(res);
    }
}
