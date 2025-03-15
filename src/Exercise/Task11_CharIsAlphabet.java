package Exercise;

public class Task11_CharIsAlphabet {
    public static void main(String[] args) {
        CheckCharIsAlphabet('7');
    }
    static void CheckCharIsAlphabet(char a){
        if(a >='A' && a <='Z')
        System.out.println("Yes it is a character");
        else if(a >='a' && a <='z')
            System.out.println("Yes it is a character");
        else
        System.out.println("No");
    }


}
