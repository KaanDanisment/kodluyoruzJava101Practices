package kodluyoruzJava101.StudenInformationSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examGrade;
    int homeworkGrade;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }
    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)) {
            this.teacher = t;
            System.out.println("Assignment successful.");
        }else {
            System.out.println(t.name + "can not teach this lesson!");
        }
    }
    void printAssignedTeacher(){
        if (teacher != null){
            System.out.println(this.name + " lesson's teacher is " + teacher.name + ".");
            this.teacher.printTeacher();
        }else {
            System.out.println("No teacher assigned to the " + this.name + " lesson.");
        }
    }
}
