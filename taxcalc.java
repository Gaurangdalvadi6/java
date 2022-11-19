import java.util.*;

public class taxcalc {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter number : ");
         int income = nr.nextInt();
        int tax;
         if(income<500000){
            tax = 0;
         }
         else if(income>=500000 && income<10000000){
            tax = (int)(0.2*income);
         }
         else{
            tax = (int)(0.3*income);
         }
         System.out.println("tax is : " + tax);
         System.out.println("Final you get : " + (income-tax));
        
    }
     
}
