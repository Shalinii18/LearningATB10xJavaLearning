package Exercise;

import java.util.Scanner;

public class Task2_EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        if(n%2==0)
            System.out.println("The number is Even");
        else
            System.out.println("Odd");
    }



}
