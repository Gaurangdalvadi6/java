import java.util.*;

public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int number = sc.nextInt();
        char ch = 'A';

        for(int line=1;line<=number;line++)
        {
            for(int chars=1;chars<=line;chars++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
