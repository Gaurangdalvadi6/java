import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);

        System.out.println("Enter any number : ");
        float number = nr.nextFloat();

        if(number%2==0){
            System.out.println("it is even number. ");
        }
        else{
            System.out.println("it is odd number. ");
        }
    }
}
