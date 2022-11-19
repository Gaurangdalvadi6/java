import java.util.*;

public class passfailternary {
    public static void main(String[] args) {
        Scanner nr = new Scanner(System.in);

        System.out.println("Enter your mark : ");
        int marks = nr.nextInt();

        String reportcard = (marks>=33)?"pass":"fail";
        System.out.println(reportcard);

    }
}
