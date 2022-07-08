package Bits;

import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 6
        System.out.print(oddEven(num));
        sc.close();
    }

    static String oddEven(int num) { // 6 = 0 1 1 0
        if ((num & 1) == 1)
            return "odd";
        else
            return "even";
    }
}
/*
 * 6 & 1 ( substitute where %2 takes place)
 * 0 1 1 0         0 1 0 1
 * 0 0 0 1         0 0 0 1
 * --------        -------
 * 0 0 0 (0) -even  0 0 0 (1) - odd
 * --------
 */