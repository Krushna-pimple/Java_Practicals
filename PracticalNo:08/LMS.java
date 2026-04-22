import java.util.Scanner;

class LMS {

    static Book books[] = new Book[5];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < books.length) {
                        System.out.print("Enter Book ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Book Name: ");
                        String name = sc.nextLine();

                        books[count++] = new Book(id, name);
                        System.out.println("Book Added");
                    } else {
                        System.out.println("Library Full");
                    }
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        books[i].displayBook();
                        
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int bid = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (books[i].bookId == bid) {
                            if (!books[i].isIssued) {
                                books[i].isIssued = true;
                                System.out.println("Book Issued");
                            } else {
                                System.out.println("Already Issued");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}