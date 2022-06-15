import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int subj1 = scan.nextInt();
        System.out.println("enter your subject marks:");
        int subj2 = scan.nextInt();
        System.out.println("enter your subject marks:");
        int subj3 = scan.nextInt();
        System.out.println("enter your subject marks:");
        int subj4 = scan.nextInt();
        System.out.println("enter your subject marks:");
        int subj5 = scan.nextInt();
        System.out.println("enter your subject marks");
        scan.close();
        float percentage = ((subj1 + subj2 + subj3 + subj4 + subj5) / 500) * 100;

        System.out.println("percentage :");
        System.out.println(percentage);

    }
}
