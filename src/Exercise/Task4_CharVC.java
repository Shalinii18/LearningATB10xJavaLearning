package Exercise;

import java.util.Scanner;

public class Task4_CharVC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch= sc.next().charAt(0);
        {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("It is Vowel");
        else
            System.out.println("It is Consonant");
        }


    }
}
