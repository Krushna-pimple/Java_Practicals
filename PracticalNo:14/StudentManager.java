public class StudentManager extends User 
        implements StudentOps, ExtraOps {

    Student[] arr = new Student[10];
    int count = 0;

    public void add(String name, int marks) throws MarksException {

        if (marks < 0 || marks > 100) {
            throw new MarksException("Invalid marks");
        }

        arr[count] = new Student(name, marks);
        count++;

        System.out.println("Added");
    }

    public void showAll() {

        for (int i = 0; i < count; i++) {
            System.out.println("Name:"+arr[i].name + " - " + "Marks"+arr[i].marks);
        }
    }

    void type() {
        System.out.println("Admin");
    }

    // ambiguity solve
    public void msg() {
        System.out.println("Resolved");
    }
}