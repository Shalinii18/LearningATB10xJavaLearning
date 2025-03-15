package Tasks;

public class This {
    public static void main(String[] args) {
Mobile m= new Mobile("Oppo","2020");
        System.out.println(m.model_name);
    }}
     class Mobile
    {
        String model_name;
        String model_year;


        Mobile(String name, String year){
           this.model_name = name;
            this.model_year = year;
        }
    }

