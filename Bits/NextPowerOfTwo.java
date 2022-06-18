package Bits;

import java.util.*;

public class NextPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        while (num != 0) {
            num >>= 1;
            result <<= 1;
        }
        System.out.print(result);
        sc.close();
    }
}
