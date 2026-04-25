import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();

        StudentOps.info(); // static

        while (true) {

            System.out.println("\n1 Add Student information \n2 Show all Student information\n3 Exit");
            int ch = sc.nextInt();

            try {
                switch (ch) {

                 case 1:
                         sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();

                         System.out.print("Marks: ");

                               int marks;

                           try {  
                                  marks = sc.nextInt();
                           } 
                           catch (Exception e) {
                                     System.out.println("Please enter number only");
                                sc.nextLine(); // clear buffer
                                continue;
                             }

                              sm.add(name, marks);
                             break;

                    case 2:
                        sm.showAll();
                        break;

                    case 3:
                        return;

                    default:
                        System.out.println("Wrong choice");
                }

            } catch (MarksException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}