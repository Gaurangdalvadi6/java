import java.util.*;

public class arrayscc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[45];
        System.out.println("length of marks : " + marks.length);
        
        marks[0] = sc.nextInt();   //physics
        marks[1] = sc.nextInt();   //maths
        marks[2] = sc.nextInt();   //chemistry
        
        System.out.println("physics : " + marks[0]);
        System.out.println("maths : " + marks[1]);
        System.out.println("chemistry : " + marks[2]);
    }
    
} 