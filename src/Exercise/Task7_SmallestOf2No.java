package Exercise;

import java.util.Scanner;

public class Task7_SmallestOf2No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n1= sc.nextInt();
        System.out.println("Enter the second Number");
        int n2= sc.nextInt();
        if(n1>n2)
            System.out.println("Smallest No. is " +n2);
        else
            System.out.println("Smallest no. is " +n1);
    }
}
