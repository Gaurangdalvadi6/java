import java.util.*;

public class leapyearornot {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter the year : ");
        int year = nr.nextInt();

        if((year%4==0 && (year%100!=0) || year%400==0) ){
            System.out.println("this is a leap year. ");
        }
        else{
            System.out.println("not leap year.");
        }
    }
}
