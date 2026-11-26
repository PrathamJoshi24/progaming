/*
Question 3

interface Employee {
    void calculateSalary();
    void display();
}
class Manager implements Employee {
    public void calculateSalary() {
    int x = 100;
    }
    public void display() {
        System.out.println("Basic Salary: " + 100);
        System.out.println("DA: " + 200);
        System.out.println("HRA: " + 300);
        System.out.println("Gross Salary: " + 400);
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateSalary();
        m.display();
    }
}
*/

/*
Question 4

interface Result{
    void calculatePercentage();
}
class Student implements Result{
    public void calculatePercentage(){
        System.out.print("ha bhai calculate karu chu 😭😭😭");
    }
}
class Main{
    public static void main (String[] args) {
        Student ob = new Student();
        ob.calculatePercentage();
    }
}
*/

/*
Question 5

interface Employee{
    void calculateSalary();
    void displayDetails();
}
class PermanentEmployee implements Employee{
    public void calculateSalary(){
        System.out.println("perm employ calculating....");
    }
    public void displayDetails(){
        System.out.println("perm employ ₹150");
    }
}
class ContractEmployee implements Employee{
    public void calculateSalary(){
        System.out.println("contract employ calculating....");
    }
    public void displayDetails(){
        System.out.println("contract employ ₹50");
    }
}
class Main{
    public static void main (String[] args) {
        PermanentEmployee obp = new PermanentEmployee();
        ContractEmployee obc = new ContractEmployee();
        obp.calculateSalary();
        obp.displayDetails();
        obc.calculateSalary();
        obc.displayDetails();
    }
}
*/