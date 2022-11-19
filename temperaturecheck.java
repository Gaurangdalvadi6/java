import java.util.*;

public class temperaturecheck {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);
        System.out.println("enter your body temperature : ");
        float temp = nr.nextFloat();

        if(temp>100){
            System.out.println("You have a fever.");
        }
        else{
            System.out.println("You don't have a fever.");
        }
    }
}
