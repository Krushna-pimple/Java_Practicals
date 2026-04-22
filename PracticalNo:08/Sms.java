import java.util.Scanner;

class SMS {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();

        int choice;

        do{

            System.out.println("1 Add Student");
            System.out.println("2 Search Student By RegNo");
            System.out.println("3 Search Student By Name ");
            System.out.println("4 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();   // buffer clear

            switch(choice){

                case 1:

                    System.out.print("Enter RegNo: ");
                    String r = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String n = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    long c = sc.nextLong();

                    m.addStudent(r,n,c);
                    break;

                case 2:

                    sc.nextLine();   // buffer clear
                    System.out.print("Enter RegNo to search: ");
                    String reg = sc.nextLine();

                    m.findByRegNo(reg);
                    break;

                case 3:

                    sc.nextLine(); 

                    System.out.print("Enter Name to search: ");
                    String name = sc.nextLine();

                    m.findByName(name);
                    break;

                case 4:

                    System.out.println("Exit");
                    break;

                default:

                    System.out.println("Invalid choice");

            }

        }while(choice != 4);

    }

}