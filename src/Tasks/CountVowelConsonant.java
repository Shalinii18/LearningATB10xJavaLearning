package Tasks;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String str = "Shalini Singh";
        int vowel=0;
        int consonant = 0;

        for(int i= 0; i< str.length() ; i++) {
            char check = str.charAt(i);
            if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' || check == 'A' || check == 'E' || check == 'I' || check == 'O' || check == 'U') {
                vowel++;
            } else {
                consonant++;

            }
        }
            System.out.println("Total vowels are " +vowel);
        System.out.println("Total constant are " +consonant);


            }
        }


