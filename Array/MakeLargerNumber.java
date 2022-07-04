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
        List list = numToList(num);
        int right = -1;
        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i) > list.get(i - 1)) {
                right = i;
                break;
            }
        }
        if (right != -1) {
            swap(list, right, right - 1);
            sort(list, right, list.size());
        }
        return listToNum(list);
    }

    static List numToList(int num) {
        List d = new ArrayList<>();
        while (num > 0) {
            d.add(0, num % 10);
            num /= 10;
        }
        return d;
    }

    static void swap(List l, int a, int b) {
        int temp = l.get(a);
        l.set(a, l.get(b));
        l.set(b, temp);
    }

    static int listToNum(int num){
        return 
    }
}