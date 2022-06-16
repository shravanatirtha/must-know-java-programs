package Bits;

import java.util.*;

public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        long power = x;
        long ans = 1;
        while (y != 0) {
            if ((y & 1) == 1)
                ans *= power;
            y >>= 1;
            power *= power;
        }
        System.out.print(ans);
        sc.close();
    }
}
