public class StringMethodsIn {

    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Harry     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("r", "ier"));

        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("y"));

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('y'));
        System.out.println(name.indexOf("y",4));
        System.out.println(name.lastIndexOf("r"));
        System.out.println(name.lastIndexOf("rry", 4));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("haRry"));

        // escape sequence
        System.out.println("I am escape sequence \" double quote\" ");
        System.out.println("I am escape sequence \\ backslash");
        System.out.println("I am escape sequence \n new line ");
        System.out.println("I am escape sequence \t tab space");
    }
}