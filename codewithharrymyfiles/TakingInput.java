import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("taking input from scanner:");
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter number 1:");
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
        // int a = sc.nextInt();
        // System.out.println("enter number2 :");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("sum of these numbers is");
        // System.out.println(sum);

    }
}
