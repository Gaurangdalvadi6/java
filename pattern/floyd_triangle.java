import java.util.*;

public class floyd_triangle {
    
    public static void floyd_triangle(int n) {
        //outer
        int couter=1;
        for (int i = 1; i <=n; i++) {
            //innner- how many times will counter be printed
            for (int j = 1; j <=i; j++) {
                System.out.print(couter + " ");
                couter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd_triangle(5);
        floyd_triangle(4);
    }
}
