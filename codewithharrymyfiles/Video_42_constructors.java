/* Constructors - A member function used to initialize an object
 while creating it. 
 - Constructors have name same as custom class name and argumennts can be added 
  inside constructors
 */

public class Video_42_constructors {
    static class MyEmployee{
        private int id;
        private String name;
        
        //overloading of constructors
       public MyEmployee() // creating constructor
       {
        id = 45;
        name = "Your-name-Here";
       }
       public MyEmployee(String myname,int myid) // creating constructor with argument
       {
        id = myid;
        name = myname;
       }

        public String getName(){ return name; }
        public void setName(String n) { name = n; }
        public int getId(){ return id;}
        public void setId(int i) { id = i;}
    }
    public static void main(String[] args) {
       // MyEmployee harry = new MyEmployee("Kreesty",42);
        MyEmployee harry = new MyEmployee();
        // harry.setName("code with harry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
