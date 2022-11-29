import java.util.*;

public class swapping {

    public static void swap(int a,int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a : ");
        int a = sc.nextInt();

        System.out.println("enter the value of b : ");
        int b = sc.nextInt();

        swap(a, b);
        
    }
}
