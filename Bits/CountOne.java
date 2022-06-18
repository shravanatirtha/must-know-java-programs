package Bits;

//Count number of ones till N in binary
import java.util.*;

public class CountOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0)
                count++;
            num >>= 1;
        }
        System.out.print(count);
        sc.close();
    }
}
