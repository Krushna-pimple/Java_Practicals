class Book {
    int bookId;
    String bookName;
    boolean isIssued;

    Book(int id, String name) {
        this.bookId = id;
        this.bookName = name;
        this.isIssued = false;
    }

    void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
    }
}