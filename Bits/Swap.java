package Bits;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(); // 2
        int num2 = sc.nextInt(); // 3
        num1 ^= num2; // a = a ^ b --- 0 0 0 1 = 1
        num2 ^= num1; // b = a ^ b --- 0 0 1 0 = 2
        num1 ^= num2; // a = a ^ b ---  0 0 1 1 = 3
        System.out.print(num1 + " " + num2);
        sc.close();
    }
}
/*

exor
0 0 1 0      0 0 0 1     0 0 0 1
0 0 1 1      0 0 1 1     0 0 1 0
----------   ---------  ---------
0 0 0 1      0 0 1 0     0 0 1 1 

 */


