/*
Apa itu Variabel
Apa itu data types 
🟥Primitive 
int
double
char
boolean
🟦Reference
String
Array
Object
Primitive VS Reference
*/
public class Variabel {
    public static void main(String[] args){
        //Primitive data types:
        //int
        int people=20;
        int age=12;
        int numbers=27;
        //double
        double water=2.5;
        double speed=40.5;
        double weight=5.7;
        double temperature=-19.56;
        //char
        char grade='A';
        char bloodtype='O';
        char vitamin='D';
        char symbols='!';
        char currency='$';
        //boolean
        boolean isStudent=true;
        boolean isHuman=false;
        boolean isMale=true;
        boolean isCool=false;
        //string
        String name="Steven";
        String colors="Green";
        String food="Nasi Padang";
        String city="Malang";
        
        //int
        System.out.println(people);
        System.out.println("Your age is "+ age);
        System.out.println("Prime numbers is "+ numbers);
        
        //double
        System.out.print("i have water maybe is "+water +" liter\n");
        System.out.println(speed + " km/hour");
        System.out.println("the weight of rice is "+ weight+ " kg");
        System.out.println("So cold because the temperature is "+ temperature+ "°c");
        
        //char
        System.out.println("I've been doing exam and i got "+grade+" in mathematics");
        System.out.println("My blood types is "+bloodtype);
        System.out.println("Today my doctor suggest me to drink vitamin "+vitamin);
        System.out.println("START"+symbols);
        System.out.println("the price is "+currency+"12.000");
        
        //boolean
        System.out.println("are u student? "+isStudent);
        System.out.println(isHuman);
        System.out.println(isMale);
        
        //if else with boolean
        if(isCool){
            System.out.println("Thats so COOL");
        }
        else{
            System.out.println("Thats NOT COOL bro");
        }
        
        System.out.println(name);
        System.out.println("My favorite colors is "+ colors);
        System.out.println("I like "+food);
        
        System.out.println("All is "+ people+ " " +water+" " +grade+ " "+isCool);
        System.out.println("I have friend,his name is "+name+" and he live in "+city);
    }
}