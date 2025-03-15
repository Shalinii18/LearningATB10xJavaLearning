package Programs;

import java.util.Scanner;

public class Fact {

    //5 = 5*4*3*2*1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int m = 0;

        for (; n > 1; n++) {
            m = n * (n - 1);
        }
        System.out.println("Factorial of a number " + m);

    }
}
