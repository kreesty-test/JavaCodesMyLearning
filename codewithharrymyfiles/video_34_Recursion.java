/*A function in java can itself, it is called as Recursion
*/

public class video_34_Recursion {

        //factorial (n) = n*(n-1)*(n-2)*.....
        //factorial(5) = 5*4*3*2*1= 120
        //factorial (n) = n * factorial(n-1)
        // factorial(0) = 1;
        static int factorial(int n){
            if (n==0 || n==1){
                return 1;
            } else
            {
                return n*factorial(n-1);
            }
        }

        static int factorail_iterative(int n){
            if (n==0 || n==1){
                return 1;
            } else
            {
                int product = 1;
                for (int i=0; i<=n; i++)
                {
                    product *=i;
                }
                return product;
            }
        }
    public static void main(String[] args) {
            int x=4;
        System.out.println("Factorial of x is " + factorial(x));
        System.out.println("Factorial of x is " +factorail_iterative(x));
    }
}
