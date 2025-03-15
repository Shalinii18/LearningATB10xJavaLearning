package Tasks;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
//        int s1=10
//                ; int s2=10;
//                int s3=10;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first side" );
       int s1= sc.nextInt();
        System.out.println("Enter second side" );
        int s2= sc.nextInt();
        System.out.println("Enter third side" );
        int s3= sc.nextInt();

        if (s1==s2 && s2==s3 && s1==s3)

            System.out.println("eqi");

        else if(s1==s2 || s2==s3 || s1==s3)
            System.out.println("iso");
        else
        System.out.println("sca");


    }
}
