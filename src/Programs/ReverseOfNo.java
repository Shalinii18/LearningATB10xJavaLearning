package Programs;

import java.util.Scanner;

public class ReverseOfNo {
    // i/o- 12345
    // 0/p- 54321
    //rough logic:

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Number is ");
        int n= sc.nextInt();
        int reversenum=0;
        while(n>0) {
            int lastdigit = n % 10; // last digit
            reversenum = reversenum * 10 + lastdigit;
            n /= 10;

        }
        System.out.println("Reverse Number is " +reversenum);
    }



}
