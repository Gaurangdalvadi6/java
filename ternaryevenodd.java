import java.util.*;

public class ternaryevenodd {
    public static void main(String args[]) {
        Scanner nr = new Scanner(System.in);

        System.out.println("enter a : ");
        int a = nr.nextInt();

        String b =  (a%2==0)?"even":"odd";
        System.out.println(b);
    }
}
