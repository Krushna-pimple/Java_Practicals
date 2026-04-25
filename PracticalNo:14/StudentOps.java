public interface StudentOps {

    void add(String name, int marks) throws MarksException;
    void showAll();

    default void msg() {
        System.out.println("Default");
    }

    static void info() {
        System.out.println("Student Management System");
    }
}