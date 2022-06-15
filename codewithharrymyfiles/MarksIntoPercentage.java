import java.util.Scanner;

public class MarksIntoPercentage {
    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks for subject 1:");
        int Marks1 = sc.nextInt();
        System.out.println("enter your marks for subject 2:");
        int Marks2 = sc.nextInt();
        System.out.println("enter your marks for subject 3:");
        int Marks3 = sc.nextInt();
        System.out.println("enter your marks for subject 4:");
        int Marks4 = sc.nextInt();
        System.out.println("enter your marks for subject 5:");
        int Marks5 = sc.nextInt();
        sc.close();

        float avg = (Marks1 + Marks2 + Marks3 + Marks4 + Marks5) / 5;
        float percent = avg / 100;
        System.out.println("Your percentage for this year is :");
        System.out.println(percent);
    }
}
