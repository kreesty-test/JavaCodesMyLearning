import java.util.Scanner;
public class else_If_loop {
    public static void main(String[] args) {
        int age ;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age >56)
        {
            System.out.println("You are experienced");
        }
        else if(age>46)
        {
            System.out.println("You are semi experienced");
        }
        else{
            System.out.println("You are naive!");
        }
    }
}
