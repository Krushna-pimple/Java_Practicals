//using super error
 
class Person{

      String name="krushna";

      Person(int x){
            System.out.println("in class person");

	}

      void display(){
        
           System.out.println("Name:"+name);
      }
}


class Teacher extends Person {
       
	String teacherName;
       
  	void result(){
             System.out.println("Teacher Name:"+teacherName );
	}
        
        Teacher(){
            super();
            System.out.println("in class Teacher");
           }
        

     public static void main(String [] args){

           Teacher t= new Teacher();
            t.display();
	    t.result();
     }
}