//heirarchical inheritance 
 
class Person{

      String name="krushna";
      void display(){
        
           System.out.println("Name:"+name);
      }
}

class Student extends Person {

      String regNo;
      void show (){

            System.out.println("RegNo:"+regNo);
      }
}

class Teacher extends Person {
       
	String teacherName;

  	void result(){
             System.out.println("Teacher Name:"+teacherName );
	}

     public static void main(String [] args){

           Teacher t= new Teacher();
           Student s= new Student();
            s.regNo="2024BIT001";
            s.show();
            s.display();
            t.display();
	    t.result();
     }
}