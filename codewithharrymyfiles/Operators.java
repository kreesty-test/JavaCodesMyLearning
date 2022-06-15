public class Operators {
    public static void main(String[] args) {
        // assignment operator
        int a = 4;
        int d = 2;
        d += 3;

        // arithmatic operator
        int b = 6 + a;
        int c = 6 % a; // modulo operator

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // comparision operator
        System.out.println(6 == 8);
        System.out.println(a > b);

        // logical operator
        // && operator both should be true
        System.out.println(63 > 2 && 63 > 8);
        // OR operator any one should be true
        System.out.println(76 < 3 || 6 > 2);

        // bitwise operators
        System.out.println(2 & 3);
    }
}
