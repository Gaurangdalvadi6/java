import java.util.*;

public class positivenegative {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter any number : ");
        float n = nr.nextFloat();

        if(n>0){
            System.out.println("it is a positive number.");
        }
        else if(n==0){
            System.out.println("it is zero.");
        }
        else{
            System.out.println("it is a negative number.");
        }
    }
}
