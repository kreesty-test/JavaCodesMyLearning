public class MultiDimArray {
    public static void main(String[] args) {
       // int [] marks ; // 1-D array
        int[] [] Flats;  // 2-D array
        Flats = new int[2][3]; // 2 rows and 3 columns
        Flats[0][0]= 101;
        Flats[0][1]= 102;
        Flats[0][2]= 103;
        Flats[1][0]= 105;
        Flats[1][1]= 106;
        Flats[1][2]= 107;

        // to print 2D array use 2 for loops
        for (int i=0; i<Flats.length; i++)
        {
            for(int j=0; j<Flats[i].length; j++)
            {
                System.out.println(Flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        //3D String array
        String [][][] arr = new String[2][3][4];
       
    }
}
