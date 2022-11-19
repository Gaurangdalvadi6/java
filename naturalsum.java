import java.util.*;

public class naturalsum {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = nr.nextInt();
        int sum = 0;
        int i = 1;
        while (i<=n) {
             sum = sum+i;
            i++;
            System.out.println(i-1 + " sum is : " + sum);
        }
        System.out.println();
        System.out.println(n + " sum is : " + sum);
    }
}
