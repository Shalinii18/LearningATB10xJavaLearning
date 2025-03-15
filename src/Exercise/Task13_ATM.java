package Exercise;

import javax.swing.*;
import java.util.Scanner;

public class Task13_ATM {
    public static void main(String[] args) {
        int Balance= 10000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter withdrawal amount");
        int amount= sc.nextInt();

        if(amount>0 && amount<Balance && (amount%100==0)){
        int withdraw = Balance-amount;
        System.out.println("Here is your amount and the Remaining balance is " +withdraw);}
        else
            System.out.println("YOU DON'T HAVE THIS AMOUNT IN YOUR ACCOUNT");

    }




}
