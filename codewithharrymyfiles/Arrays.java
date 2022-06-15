public class Arrays {
    public static void main(String[] args) {
/*        int [] marks1 = new int[5];
        marks1[0]=100;
        int [] marks2 = new int[5];
        int [] marks = {100,40,34,67,98};

        float [] marks1 = {98,45,67,89,54};

        String []students = {"kreesty","shivani"};
        System.out.println(students[0]);
        System.out.println(marks.length); */

        //display array using for loop
        int [] marks = {100,40,34,67,98};
        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        //display array in reverse order
//        for(int i=marks.length;i>0; i++)
//        {
//            System.out.println(marks[i]);
//        }

        // display using for each loop
        for(int element: marks)
        {
            System.out.println(element);
        }
}}
