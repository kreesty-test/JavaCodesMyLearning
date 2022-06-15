public class PrecedenceOfOperators {
    public static void main(String[] args) {
        int a = 6 * 5 - 34 / 2;
        int b = 60 / 5 - 34 * 2;
        System.out.println(a);
        System.out.println(b);
        // Precedence --> * / has same precesidence
        // Associativity

        // quick quiz:
        int x = 4;
        int y = 2;
        int c = 4;
        int z = b * b - (4 * a * c) / (2 * a);
        System.out.println(z);

        System.out.println((x - y) / 2);
    }
}
