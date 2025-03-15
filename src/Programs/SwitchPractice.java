package Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();

        switch (a)
        {
            case 1:
                System.out.println("Mon");
               break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Frid");
                break;
            case 6:
                System.out.println("Sat");
break;

            default:
                System.out.println("sun");



        }


    }
}
