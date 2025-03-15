package Exercise;

import java.util.Scanner;

public class Task6_Largestof3No {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First No.");
        int n1= sc.nextInt();
        System.out.println("Enter the Second No.");
        int n2= sc.nextInt();
        System.out.println("Enter the Third No.");
        int n3= sc.nextInt();

        int result= (n1>n2?(n1>n3?n1: n3):(n2>n3 ? n2 :n3));
        System.out.println("Largest from the three number is " +result);

    }
}
