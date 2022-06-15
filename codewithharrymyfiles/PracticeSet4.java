import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
        // question 1:
        int a=11;
        if(a==11)
        {
            System.out.println("all is well");
        }

        //question 2:
        Scanner sc = new Scanner(System.in);
        byte m1,m2,m3;
        System.out.println("enter marks in subject 1:");
        m1= sc.nextByte();

        System.out.println("enter marks in subject 2:");
        m2= sc.nextByte();

        System.out.println("enter marks in subject 3:");
        m3= sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your overall percentage is : "+ avg);

        if(avg >= 40 && m1>33 && m2>33 && m3>=33)
        {
            System.out.println("Congratulations you have been promoted" + avg);
        }
        else {
            System.out.println("You haven't been promoted!");
        }

        //Question 3- Income tax calculator
        /*Rs 7.5 lakh – Rs 10.00 lakh	15%
        Rs 10.00 lakhs – Rs 12.50 lakh	20%
        Rs 12.5 lakhs – Rs 15.00 lakh	25%
        > Rs 15 lakh	30% */

        System.out.println("enter your income");
        Scanner sce = new Scanner(System.in);
        float income = sce.nextFloat();
        float tax=0;
        if (income<7.5)
            {
                tax = tax + 0;
            }
        else if (income>7.5f && income < 10.00f)
            {
                tax = tax + 0.15f* (income - 7.5f);

            }
        else if (income>10.00f && income <=12.5f)
        {
            tax = tax + 0.15f* (10.0f - 7.5f);
            tax = tax + 0.2f* (income - 10.00f);

        }

        else if (income>12.5 && income <= 15.0) {
            tax = tax + 0.15f * (10.0f - 7.5f);
            tax = tax + 0.2f * (12.5f - 10.00f);
            tax = tax + 0.25f * (income - 12.5f);
        }
        System.out.println("your total tax is :");
        }
}
