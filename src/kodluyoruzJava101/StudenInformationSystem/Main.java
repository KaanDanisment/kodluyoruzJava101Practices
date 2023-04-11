package kodluyoruzJava101.StudenInformationSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MAT101", "MAT" );
        Course physic = new Course("Physic", "PHY101", "PHY");
        Course chemistry = new Course("Chemistry", "CHE101", "CHE");

        Teacher t1 = new Teacher("Ahmet Teacher","43","MAT");
        Teacher t2 = new Teacher("Mehmet Teacher","55","PHY");
        Teacher t3 = new Teacher("Veli Teacher", "54","CHE");

        math.addTeacher(t1);
        physic.addTeacher(t2);
        chemistry.addTeacher(t3);
        math.printAssignedTeacher();
        physic.printAssignedTeacher();
        chemistry.printAssignedTeacher();

        Student s1 = new Student("Ahmet","1111",2,math,physic,chemistry);
        s1.addBulkExamGrade(0,0,0);
        s1.addBulkHomeworkGrade(0,0,0);
        s1.isPass();

        Student s2 = new Student("Mehmet","2222",3,math,physic,chemistry);
        s2.addBulkHomeworkGrade(65,98,30);
        s2.addBulkExamGrade(33,21,31);
        s2.isPass();

        Student s3 = new Student("Veli","3333",6,math, physic,chemistry);
        s3.addBulkExamGrade(78,98,98);
        s3.addBulkHomeworkGrade(68,87,78);
        s3.isPass();
    }
}
