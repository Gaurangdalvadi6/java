import java.util.*;

public class rowsamestar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter value");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}