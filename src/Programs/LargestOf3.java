package Programs;

public class LargestOf3 {

    public static void main(String[] args) {
        int n1= 12; int n2=14; int n3= 20;
        int result = (n1>n2)? ((n1>n3)? n1: n3): ((n2>n3)?n2:n3);
       System.out.println("Largest Number: " +result);
        //System.out.println('result');
    }
}
