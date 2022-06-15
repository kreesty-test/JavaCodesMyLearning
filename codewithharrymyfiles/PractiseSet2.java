import java.util.Scanner;

public class PractiseSet2 {
    public static void main(String[] args) {

        // 1. evaluate the value of expression
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);

        // 2. Write a java program to encrypt a grade by adding 8 to it.
        char grade = 'B';
        grade = (char) (grade + 8);
        // decrpting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

        // 3. Use comparision operators to find out wheather a given number is greater
        // than the user entered number or not.
        Scanner num = new Scanner(System.in);
        int b = num.nextInt();
        System.out.println(b > 5);
        num.close();
        // Evaluate expression value
        int v = 1;
        int u = 2;
        int d = 3;
        int s = 4;
        int c = (v * v) - (u * u) / (2 * d * s);
        System.out.println(c);

        // evalute this expression

        int x = (7 * 49 / 7 + 35 / 7);
        System.out.println(x);
    }
}
