public class Main{
    public static void nestedIf(String[]args){
        
        boolean isStudent=true;
        boolean isSenior=true;
        double price=9.99;
        
        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount 20%");
                System.out.println("You get a student discount 10%");
                price*=0.8*0.9;
            }
            else{
            System.out.println("You get a student discount 10%");
            price*=0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount 20%");
               price*=0.8;
            }
            else{
            price*=1;
            }
        }
        System.out.printf("The price of ticket is: $%.2f",price);
    }
}