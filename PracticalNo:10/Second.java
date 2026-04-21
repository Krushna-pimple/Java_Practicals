// Multilevel inheritance 
 
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

class DsyStudent extends Student {
       
	int AdmitionYear;

  	void result(){
             System.out.println("Admition Year:"+ AdmitionYear);
	}

     public static void main(String [] args){

           DsyStudent s= new DsyStudent();
     
            s.regNo="2024BIT001";
            s.show();
            s.display();
	    s.result();
     }
}