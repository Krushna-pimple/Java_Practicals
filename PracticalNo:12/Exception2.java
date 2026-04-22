import java.io.FileReader;
import java.io.FileNotFoundException;
class Exception{

      public static void main(String [] args) {
           try{ FileReader fr= new FileReader("Exception2.java");
              }
           catch(FileNotFoundException e){

                   System.out.println("FileNotFound");
              }
           try{     int[] f= new int[3];     
                  System.out.println( f[5]);
              }
          catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("ArrayIndexOutOfBounds");
              }
	   try{         int a=5/0;
                    int b=3,c=0;
                    int r=b/c;  }
          catch(ArithmeticException e){
                    System.out.println("Invalid divided by zero");
               }
     }



}