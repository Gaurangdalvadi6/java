import java.util.Scanner;


public class solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.println("enter the number : ");
            number = sc.nextInt();

            if (number%2==0) {
                evensum=evensum+number;
            }else{
                oddsum=oddsum+number;
            }
            System.out.println(" do you want to continue? press 1 for yes or press 0 for no.");
            choice = sc.nextInt();
        } while (choice==1);
        System.out.println("sum of even number : " + evensum);
        System.out.println("sum of odd number : " + oddsum);

    }
}
