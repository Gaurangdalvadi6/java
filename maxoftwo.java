import java.util.*;;

public class maxoftwo {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);

        System.out.println("input1 : ");
        int input1 = nr.nextInt();

        System.out.println("input2 : ");
        int input2 = nr.nextInt();

        if(input1>input2){
            System.out.println("Largest is input1. " + input1);
        }
        else if(input1==input2){
            System.out.println("Both are equal. ");
        }
        else{
            System.out.println("Largest is input2. " + input2);
        }
    }
}
