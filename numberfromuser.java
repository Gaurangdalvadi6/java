import java.util.*;

public class numberfromuser {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();

        int i=1;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
