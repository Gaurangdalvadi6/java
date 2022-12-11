import java.util.*;

public class factorialnumbyuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number : ");
        int n = sc.nextInt();
        int factorial =1;
        int i = 1;

        for (i = 1; i <= n; i++) {
            factorial*=i;

            // when use i in loop its value is i value is same.
            System.out.println((i) + " number is : " + factorial );
        }
        // when you are use i outside i value is increase by +1 so you decrease its value first in outside
        System.out.println((i-1) + " number is : " + factorial );
    }
}
