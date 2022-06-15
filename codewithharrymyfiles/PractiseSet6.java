public class PractiseSet6 {
    public static void main(String[] args) {
        //Problem 1

       /* float [] fiveFloats = {1.2f, 65.8f, 66.0f, 53.7f,34.9f};
        float sum = 0;

        for (float element:fiveFloats)
        {
            sum = sum + element;
        }
        System.out.println("The value of sum is : " + sum);

        //Problem 2
        float [] fiveFloats = {1.2f, 65.8f, 66.0f, 53.7f,34.9f};
        float num = 1.2f;
        boolean isinArray = false;
        for (float element:fiveFloats)
        {
            if(num==element)
            {
                isinArray = true;
                break;
            }
        }
        if(isinArray){
            System.out.println("the value is present");
        }else {
            System.out.println("value is not in array");
        }

        //Problem 3
        float [] marks = {1.2f, 65.8f, 66.0f, 53.7f,34.9f};
        float sum=0;
        for (float element:marks) {
            sum= sum +element;

        }
        System.out.println("the average is"+ sum/marks.length);

        // problem 4 - sum of 2 - 2D arrays

        int [] [] mat1 = {{1,2,3}, {3,4,5}};
        int [] [] mat2 = {{2,6,7}, {31,40,52}};
        int [][] result = {{0,0,0}, {0,0,0}};

        for(int i=0; i<mat1.length; i++) // row number of times
        {
            for(int j =0; j<mat1[i].length; j++) // column number of times
            {
                System.out.printf("setting value for i=%d and j=%d\n", i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];

            }
        }
        //printing the elements of 2-D array
        for(int i=0; i<mat1.length; i++) // row number of times
        {
            for(int j =0; j<mat1[i].length; j++) // column number of times
            {
                System.out.printf(result[i][j] + " ");
                result[i][j]= mat1[i][j] + mat2[i][j];

            }
            System.out.println(" ");


     //Problem 5
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n= Math.floorDiv(l,2);
        int temp;
        System.out.println(n);
        for (int i=0; i<n;i++){
            // swap a[i] and a[l-1-i]

            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for (int element:arr) {
            System.out.print(element + " ");

        }*/

        //problem 4
        int [] arr = {111,2898,37,45,52,66};
        int max = arr[0];
        int l=arr.length;
        for(int i=0; i<l; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];

            }
        }
        System.out.println(max);

// problem 7




        }
    }

