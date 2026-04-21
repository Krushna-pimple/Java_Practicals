//parentclass referance child class object 
 
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

class Teacher extends Person {
        int x=20;
	String teacherName="Akshay Sir";
       
  	void result(){
             System.out.println("Teacher Name:"+teacherName );
	}
        
        Teacher(){
              super();
              System.out.println("in class Teacher");
           }
        

       public static void main(String [] args){

           Person t= new Teacher();
            t.display();
	   System.out.println(t.x);
            
	    
     }
}