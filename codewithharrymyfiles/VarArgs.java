/* Varargs are used when we don;t want to override
and define method again and again
* */


public class VarArgs {
 /*   static int sum(int a, int b)
    {
        return a+b;
    }*/
    static int sum(int x, int...arr)
    // (int ...arr) will return all arguments in form of array
    {
        // available as int [] arr;
        
        int result = x;
        for(int a :arr)
        {
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        System.out.println("sum is "+ sum(4,6));
        System.out.println(sum(4,8,1));
        System.out.println(sum(5,7,9,1,4));
        System.out.println(sum(6)); // zero is o/p when no variable is declared

    }
}
