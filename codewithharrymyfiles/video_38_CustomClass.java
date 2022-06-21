public class video_38_CustomClass {

    static class Employee{
        int id;
        String name;
        int salary;

        public void printDetails(){
            System.out.println("My id is: "+id);
            System.out.println("My name is: " +name);
        }

        public int getSalary(){
            return salary;
        }
    }
    public static void main(String[] args) {
        System.out.println("This is custom class!");
        Employee harry = new Employee(); 
        Employee john = new Employee();
        //Instanciating a new employee object

        //setting attributes for harry
        harry.id= 12;
        harry.name= "harry";
        harry.salary= 56000;
        
        //setting attributes for john
        john.id=13;
        john.name="John Tripathi";
        john.salary= 20000;

        //printing the attributes
        // System.out.println(harry.name);
        // System.out.println((harry.id));
        harry.printDetails();
        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);

        
    }
}
