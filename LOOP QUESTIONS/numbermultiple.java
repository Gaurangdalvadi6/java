import java.util.*;

public class numbermultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        int i;
        int j;

        for (i = 1; i<=a; i++) {
            for (j = 1; j <=b; j++) {
                 System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
