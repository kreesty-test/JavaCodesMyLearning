public class LogicalOperators {
    public static void main(String[] args) {
        /*  Logical operators
            && -> AND
            || -> OR
            ! -> NOT   */
        System.out.println("For logical AND");
        boolean a=  true;
        boolean b = false;
        boolean c = true;
        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For logical OR");
        boolean a1=  true;
        boolean b1 = true;

        if (a1||b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("for logical NOT");
        System.out.println("Not (a) is ");
        System.out.println(!a);
        System.out.println("Not (b) is ");
        System.out.println(!b);

    }
}
