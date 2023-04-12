package kodluyoruzJava101.SalaryCalculator;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax;
    double overtime;
    int workingYear;
    double raise;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            tax = this.salary * 0.03;
            return tax;
        } else return 0;
    }

    double bonus() {
        if (workHours > 40) {
            overtime = this.workHours - 40;
            return overtime * 30;
        } else return 0;
    }

    double raiseSalary() {
        workingYear = 2021 - this.hireYear;
        if (workingYear < 10) {
            raise = this.salary * 0.05;
            return raise;
        } else if (9 < workingYear && workingYear < 20) {
            raise = this.salary * 0.10;
            return raise;
        } else {
            raise = this.salary * 0.15;
            return raise;
        }
    }public String toString(){
        return "Name: " + this.name +
                " Salary: " + this.salary +
                " Working Hour in a Week: " + this.workHours +
                " Year of Employment: " + this.hireYear +
                " Tax: " + tax() +
                " Bonus: " + bonus() +
                " Raise: " + raiseSalary() +
                " Salary with Tax and Bonus: " + ((this.salary + bonus()) - tax()) +
                " Total Salary: " + (this.salary + raiseSalary());
    }
}
