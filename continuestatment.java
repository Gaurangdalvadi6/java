import java.util.*;

public class continuestatment {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("enter number : ");
        int i = sr.nextInt();

        for (int j = 1; j <=i; j++) {
            if (j==3) {
                continue;
            }
            System.out.println(j);
        }
    }
}
