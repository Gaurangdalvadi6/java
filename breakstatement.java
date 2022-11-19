import java.util.*;

public class breakstatement {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);

        do {
            System.out.println("enter your number :  ");
            int n = nr.nextInt();
            if (n%10==0) {
                break;
            }
            System.out.println(n);
        } while (true);
    }
}
