package kodluyoruzJava101.StudenInformationSystem;

public class Student {
    String name;
    String stNo;
    int classes;
    Course math;
    Course physic;
    Course chemistry;
    double avarage;
    double mathAvarage;
    double physicAvarage;
    double chemistryAvarage;
    boolean isPass;

    Student(String name, String stNo, int classes, Course math, Course physic, Course chemistry) {
        this.name = name;
        this.stNo = stNo;
        this.classes = classes;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.isPass = false;
    }

    void addBulkExamGrade(int math, int physic, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.examGrade = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.examGrade = physic;
        }

        if (physic >= 0 && physic <= 100) {
            this.chemistry.examGrade = physic;
        }
    }

    void addBulkHomeworkGrade(int math, int physic, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.homeworkGrade = math;
        }

        if (physic >= 0 && physic <= 100) {
            this.physic.homeworkGrade = physic;
        }

        if (physic >= 0 && physic <= 100) {
            this.chemistry.homeworkGrade = physic;
        }
    }
    boolean isCheckPass() {
        this.mathAvarage = (this.math.examGrade * 0.80) + (this.math.homeworkGrade * 0.20);
        this.physicAvarage = (this.physic.examGrade * 0.80) + (this.physic.homeworkGrade * 0.20);
        this.chemistryAvarage = ( this.chemistry.examGrade * 0.80) + (this.chemistry.homeworkGrade * 0.20);
        this.avarage = (this.chemistryAvarage + this.physicAvarage + this.mathAvarage) / 3.0;
        return this.avarage > 55;
    }
    void printGrades(){
        System.out.println("Student: " +this.name);
        System.out.println("Mathematichs Homework Grade: " + this.math.homeworkGrade);
        System.out.println("Mathematichs Exam Grade: " + this.math.examGrade);
        System.out.println("Physics Homework Grade: " + this.physic.homeworkGrade);
        System.out.println("Physics Exam Grade: " + this.physic.examGrade);
        System.out.println("Chemistry Homework Grade: " + this.chemistry.homeworkGrade);
        System.out.println("Chemistry Exam Grade: " + this.chemistry.examGrade);
    }
    void isPass(){
        this.isPass = isCheckPass();
        printGrades();
        System.out.println("Avarage: " + this.avarage);
        if (this.isPass){
            System.out.println("Passed the Class");
        }else {
            System.out.println("Missed the Class");
        }
    }
}
