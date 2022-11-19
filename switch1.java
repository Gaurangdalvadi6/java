import java.util.*;

public class switch1 {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter any number : ");
        int number = nr.nextInt();

        switch (number) {
            case 1:
                System.out.println("Dosa");
                break;
            case 2:
                System.out.println("Idli");
                break;
            case 3:
                System.out.println("Vadapav");
                break;
            case 4:
                System.out.println("Samosa");
                break;
            case 5:
                System.out.println("Alootikki");
                break;
            default:
                System.out.println("your enter number is wrong. ");
        }
    }
}
