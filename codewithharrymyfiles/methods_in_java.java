/*
       - When we do not want to repeat the logic then we need to use
       Methods
       - DRY Principle --> do not repeat yourself
       - method is a function written inside a class
       - dataType name( parameters )
       {
        // Method body
       }
       - A method can be called by  creating object of a class in which
        the method exists
       */
public class methods_in_java {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z= (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b = 7;
        int c;
        c= logic(a,b);
        System.out.println(a+" " + b);
        /*
        method invocation using object creation
         methods_in_java obj = new methods_in_java();
        c= obj.logic(a,b);
        */

        //a and b will replace x and y in above logic method
        int a1=2;
        int b1 = 1;
        int c1;
        //c1 =obj.logic(a1,b1);
        c1 =logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
