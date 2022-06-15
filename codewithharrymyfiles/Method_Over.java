/*  Void return type--> which returns nothing , used when we want
 to return  nothing from a method!
 Static keyword ->  static keyword is used to associate
 a method of a given class
- we can call static method from static method w/o making any 
 objects of that method
*/

public class Method_Over {
	static void change(int a) {
		a= 98;
	}
	static void change2(int [] arr) {
		arr[0] = 98;
	}
    static void tellJoke(){
        System.out.println("I invented a new word");
    }
    public static void main(String[] args) {
      //  tellJoke();
    	int [] marks = {34,35,87,76,66};
    	
    	//1.changing the integer
    	
    	int x = 45;
    	change(x);
    	System.out.println("X  after running  change is " + x);
    	
    	
    	//2. changing the array
    	change2(marks);
    	System.out.println("The value of X after change is :" +marks[0]);
    	
    	
    	
    	
//    	
    }
}
