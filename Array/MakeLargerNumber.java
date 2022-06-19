package Array;

//Given a number whose digits are unique, find the next larger number that can be formed with those digits.
import java.util.*;

public class MakeLargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(makeLargeNumber(num));
        sc.close();
    }

    static int makeLargeNumber(int num) {
        return num;
    }
}