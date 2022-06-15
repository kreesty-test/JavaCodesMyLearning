public class whileloop {
    public static void main(String[] args) {
        /* Three types of loop in JAVA:
        1. While loop
        2. do while loop
        3. for loop
         */
        System.out.println("Using while loop");
        int i = 1;
        while(i<=3) // while(condition)
        {
            System.out.println(i);
            i++; // increment or decrement
        }

//        while (true)
//        {
//            System.out.println("infinite while loop");
//        }
        int num = 100;
        while(num<=200)
        {
            System.out.println(num);
            num++;
        }
    }
}
