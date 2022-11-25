import java.util.*;

public class invertedstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input : ");
        int number = sc.nextInt();

       // if line number is increase and star is decreased by one so, star <=number-line+1;
        for(int line =1; line<=number;line++){
            for(int star =1;star<=number-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
