import java.util.*;

public class maxofthree {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);

        System.out.println("input1 : ");
        float input1 = nr.nextFloat();

        System.out.println("input2 : ");
        float input2 = nr.nextFloat();

        System.out.println("input3 : ");
        float input3 = nr.nextFloat();

        if(input1>=input2 && input1>=input3){
            System.out.println("largest is input1.");
        }
        else if(input2>=input3){
            System.out.println("largest is input2.");
        }
        else{
            System.out.println("largest is input3. ");
        }
    }
}
