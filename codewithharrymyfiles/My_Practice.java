import java.util.Scanner;

public class My_Practice {
    public static void main(String[] args) {
 /* Question 1
    Write a program to print numbers from 1 to 10*/
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


 /* Question 2
Write a program to calculate the sum of first 10 natural
number*/
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum += j;
        }
        System.out.println("Sum:" + sum);

        /*Write a program that prompts the user to input a positive
         * integer. It should then print the multiplication table of
         *  that number.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        System.out.println("multiplication table of :" + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + (num * i));
        }
/* Write a program to find the factorial value of any number
entered through the keyboard */

        Scanner factNum = new Scanner(System.in);
        System.out.println("enter the number for which you want factorial: ");
        sc.close();
        int n = factNum.nextInt();
        int fact = 1;

        for (int k = 1; k <= n; k++) {
            fact *= k;


        }
        System.out.println("Factorial :" + fact);
        factNum.close();
    }
}


