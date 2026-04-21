//parentclass referance child class object  
// method overloding
 
class Person{
      int x=10;
      String name="krushna";

      Person(){
            System.out.println("in class person");

	}

      void display(){
        
           System.out.println("Name:"+name);
      }
}

class Student extends Person {
        int x=20;
	String studentName="Akash";
       
  	void display(){
             System.out.println("Student Name:"+ studentName );
	}
        
        Student(){
              super();
              System.out.println("in class Teacher");
           }
        

       public static void main(String [] args){

           Person s1= new Student();
            s1.display();
	   System.out.println(s1.x);
           
           Student s2=new Student();
            System.out.println(s2.x);
               s2.display();
	    
     }
}