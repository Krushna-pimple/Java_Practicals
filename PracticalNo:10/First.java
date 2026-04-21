//Single inheritance

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


     public static void main(String [] args){

           Student s= new Student();
     
            s.regNo="2024BIT001";
            s.show();
            s.display();
     }
}