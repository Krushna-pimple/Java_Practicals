    public class Sy2024bit001 {   
 
     static void pp1(int size){       
         for (int ln=1;ln<size;ln++){
          System.out.print("*".repeat(ln));
          System.out.print(" ".repeat(2*(size-ln)-1));
          System.out.print("*".repeat(ln));
          System.out.println("");
            }
          System.out.print("*".repeat(2*size-1));
          System.out.println("");
        } 

      static void pp2(int size){
         for (int ln=1;ln<=size;ln++){
           System.out.print(" ".repeat(ln-1));
           System.out.print("*".repeat(size));
           System.out.println("");
            }
        }
     
      static void pp3(int size){
        for(int ln=1;ln<=size ;ln++){
             System.out.print(" ".repeat(size-ln));
          for(int j=1;j<=ln;j++)   {
             System.out.print("+");
             System.out.print(" ");
          }
        System.out.println("");
        }
        for(int l = 1; l < size; l++) {
         System.out.print(" ".repeat(l));      
        for(int j = 1; j <= size - l; j++) { 
          System.out.print("+ ");
         }
          System.out.println();
        }
        }

      static  void pp4(int size){
       int num=1;
        for (int ln=1;ln<=size;ln++){
            for(int pos=1;pos<=ln;pos++){
                System.out.print(num +" "); 
                num++;
            }
             System.out.println(" ");
        } 
        }

      static void pp5(int size) {
         int num = 1;
        for (int i = 1; i <= size; i++) {
        System.out.print(" ".repeat(size - i));
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
      }
       for (int i = size - 1; i >= 1; i--) {
        System.out.print(" ".repeat(size - i));

        if (i == 1) {
            System.out.print("1 ");
        } else {
            for (int j = 1; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
        }
        System.out.println();
       }
       }

       public static void main(String[] args) {
        pp1(4);
        pp2(3);
        pp3(4);
        pp4(3);
        pp5(4);
    }
}