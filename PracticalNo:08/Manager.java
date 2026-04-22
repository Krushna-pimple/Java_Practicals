class Manager {

    Student[] s = new Student[30];
    int count = 0;

    void addStudent(String r, String n, long c){

        s[count] = new Student(r, n, c);
        count++;

        System.out.println("Student Added Successfully");
    }

    void findByRegNo(String R){

        for(int i = 0; i < count; i++){

            if(s[i].regNo.equals(R)){
                s[i].display();
                return;
            }

        }

        System.out.println("Student Not Found");
    }

    void findByName(String N){

        for(int i = 0; i < count; i++){

            if(s[i].name.equals(N)){
                s[i].display();
                return;
            }

        }

        System.out.println("Student Not Found");
    }

}