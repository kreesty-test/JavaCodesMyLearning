/* access modifiers:
1. Private
2. Default
3. Protected
4. Public

getters return a value 
setter does not return value it sets a value

*/ 

public class video_40_getters_and_setters {

    static class MyEmployee{
        private int id;
        private String name;

        public String getName()
        {
            return name;
        }
        public void setName(String n)
        {
            name = n;
        }
       
        public int getId()
        {
            return id;
        }
        public void setId(int i)
        {
            id = i;
        }
    }

    static class Circle{
        float radius;
        float pi = 3.14f;
        public float getArea()
        {
            return pi*radius*radius; 
        }
        public void setArea(float r)
        {
            radius = r;
        }
        public float getPerimeter()
        {
            return  2*pi*radius;
        }
        public float setPerimeter(float r)
        {
            return radius = r;
        }

    }

    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 23;
        // harry.name= "harry it is"; --> throws an error due to private keyword

        harry.setName("harry");
        System.out.println(harry.getName());
    }
}
