class Student {

    String regNo;
    String name;
    long contactNo;

    Student(String a, String b, long c){
        regNo = a;
        name = b;
        contactNo = c;
    }

    void display(){
        System.out.println("RegNo: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactNo);
        
    }

}