public class video_39_PractiseSet8 {

    static class Employee{

        int salary;
        String name;

        public int getSalary()
        {
        return salary;
        }
        public String getName()
      {
          return name;
      }
        public void setName(String n)
        {
            name = n;
        }
        
    }

    static class Cellphone{
        public void ring()
        {
            System.out.println("ringing cellphone!!!");
        }
        public void vibrate()
        {
            System.out.println("vibrating cellphone!!!");
        }
        public void Call()
        {
            System.out.println("Callin a friend via cellphone!!!");
        }
    }

    static class square{
        int  length;
        public int area()
        {
            return length*length;
        }
        public int perimiter()
        {
            return 4*length;
        }
    }

    static class TommyVecetti{
        public void hit(){
            System.out.println("Hitting the enemy");
        }
        public void run (){
            System.out.println("Running!");
        }
        public void fire()
        {
            System.out.println("Firing on enemy");
        }
    }

    static class Circle{
        double radius;
        double pi = 3.14;
        public double area(){
            return pi*radius*radius;
        }
        public double perimeter(){
            return 2*pi*radius;
        }
    }

    public static void main(String[] args) {
        
        //problem 1
       /* Employee harry = new Employee();
        harry.salary= 25000;
        harry.setName("harry");
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    
        // Problem 2
        Cellphone iphone = new Cellphone();
        iphone.ring();
        iphone.vibrate();
        iphone.Call();

        //problem 3
        square sq = new square();
        sq.length = 2;
        System.out.println(sq.area());
        System.out.println(sq.perimiter()); 

        //problem 5
        TommyVecetti t = new TommyVecetti();
        t.run();
        t.fire();
        t.hit();*/

        //problem 
        Circle c = new Circle();
        c.radius= 2;
        System.out.println( c.area());
        System.out.println(c.perimeter());  

}
    
}
