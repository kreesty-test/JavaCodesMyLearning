import java.util.Random;
import java.util.Scanner;

public class rockPaperSeasor {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 0 for rock, 1 for paper, 2 for scissior");
    int userInput = sc.nextInt();

    Random random = new Random();
    int computerInput = random.nextInt(3);
    sc.close();

    if (userInput == computerInput)
    {
        System.out.println("Draw");
    }
    else if (userInput ==0 && computerInput ==2 || userInput ==1 && computerInput ==0|| userInput == 2 && computerInput ==1){
        System.out.println("you win!");
    }
    }
    
}
