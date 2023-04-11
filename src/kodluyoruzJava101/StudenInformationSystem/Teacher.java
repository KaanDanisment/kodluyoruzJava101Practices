package kodluyoruzJava101.StudenInformationSystem;

public class Teacher {
    String name;
    String age;
    String branch;

    Teacher(String name, String age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }
    void printTeacher(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Branch: " + this.branch);
    }
}
