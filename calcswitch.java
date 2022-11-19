import java.util.*;

public class calcswitch {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);

        System.out.println("Enter first number : ");
        float a = nr.nextFloat();

        System.out.println("Enter Second number : ");
        float b = nr.nextFloat();

        System.out.println("Enter any operator : ");
        char operator = nr.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("sum :" + (a + b));
                break;
            case '-':
                System.out.println("sub :" + (a - b));
                break;
            case '*':
                System.out.println("multiply :" + (a * b));
                break;
            case '/':
                System.out.println("divide :" + (a / b));
                break;
            case '%':
                System.out.println("modulo :" + (a % b));
                break;
            default:
                System.out.println("please select valid operator");
        }
    }
}
