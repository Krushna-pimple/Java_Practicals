class Student {
    int studentId;
    String studentName;

    Student(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
    }
}