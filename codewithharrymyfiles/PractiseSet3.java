public class PractiseSet3 {
    public static void main(String[] args) {
    //Problem 1
        String name = "KREESTY";
        String nametoLowerCase = name.toLowerCase();
        System.out.println(nametoLowerCase);

     // problem 2
        String text = "To lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        // problem 3
        String letter = "Dear <|name|> , Thanks a lot!";
        letter = letter.replace("<|name|>","Kreesty");
        System.out.println(letter);

        //problem 4
        String MyString = "This string contains  double and   triple spaces";
        System.out.println(MyString.indexOf("  "));
        System.out.println(MyString.indexOf("   "));


    }
}
