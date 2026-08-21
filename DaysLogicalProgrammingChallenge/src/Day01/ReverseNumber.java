package Day01;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        int num = sc.nextInt();
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;       // Last digit
            reverse = reverse * 10 + digit;
            num = num / 10;             // Last digit remove
        }

        System.out.println("Reverse Number = " + reverse);
    }
}