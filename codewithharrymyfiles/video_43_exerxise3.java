/* Create a class Game which allows users to guess the number 
        game once .Game should have the following methods:

        1.Constructor to generate the random number
        2.takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect wheather the number enterd by user
        4.getters and setters for number of guesses

        use properties such as noOfGuesses(int) to get this task done*/
        
import java.util.Random;
import java.util.Scanner;

public class video_43_exerxise3 {
    //Class game
    static class Game{
        public int number;
        public int noOfGuesses;
        public int inputNumber;

        public int getnoOfGuesses(){
            
            return noOfGuesses;
        }
        public void setnoOfGuesses(int noOfGuesses)
        {
            this.noOfGuesses= noOfGuesses;
        }

        // Constructor to generate random number
        Game(){
            Random rand = new Random();
            this.number = rand.nextInt(100);
        }

        // to take a user input of number
        int  takeUserInput(){
            System.out.println("guess the number : ");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
            sc.close();
            return inputNumber;  
        }

        // to detect whether the number entered by the user is true
        boolean  isCorrectNumber() 
        {
          if(inputNumber==number){
            return true;
          }
          else if(inputNumber<number){
            System.out.println("To low...");
          }
          else if (inputNumber>number){
            System.out.println("To high...");
          }
          return false;
        }

    public static void main(String[] args) {
        
            Game g = new Game();
            g.takeUserInput();
            boolean b = g.isCorrectNumber();
            System.out.println(b);              
                
            }
        }
        
    }

