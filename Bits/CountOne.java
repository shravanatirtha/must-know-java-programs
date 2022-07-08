package Bits;

//Count number of ones till N in binary
import java.util.*;

public class CountOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 6
        System.out.print(count(num));
        sc.close();
    }
    static int count(int num){ // 6
        int one=0;
        while (num != 0) { // 0 1 1 0
            if ((num & 1) ==1) 
                one++;
            num >>= 1;
        }
        return one;
    }
}
/*
6 
while( 6 !=0 )
0 1 1 0 >> 1                                << left shit       >> right
0 1 1 & 1 >> 1 =  0 1 >> 1 = 0 >> 1  0----- (0000) 4 bits=nibble 0110 8 bits= 1 byte
--------------------------------------------0000 0000 0000 0000 0000 0000 0000 0110

 */