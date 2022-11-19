import java.util.*;

public class reversenum {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        
        System.out.println("enter any number : ");
        int number = nr.nextInt();

        while (number>0) {
            int  lastdigit = number%10;
             System.out.print(lastdigit + " ");
            number = number/10;
        }
        
        System.out.println( );

    }
}
