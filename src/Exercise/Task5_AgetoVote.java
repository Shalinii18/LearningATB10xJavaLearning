package Exercise;
import java.util.Scanner;
public class Task5_AgetoVote {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the age");
        int age=sc.nextInt();

        if(age>=18)
            System.out.println("Yes, you can vote");
        else
            System.out.println("SORRY, you can't vote");
    }
}
