import java.util.*;

public class getoriginalnum {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        
        System.out.println("Enter Any Number : ");
        int n = nr.nextInt();

        int reverse = 0;
        while (n>0) {
             int lastdigit = n%10;
             reverse = (reverse*10) + lastdigit;
             n = n/10;
             
            }
            System.out.println(reverse);
    }
}
