import java.util.Date;


public class Employee {
    String ID, name;
    Date DOB;
    double salary;
    public Employee(String ID, String name, Date DOB, double salary){
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.salary = salary;
    }
    public String getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public Date getDOB(){
        return this.DOB;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setID(String newID){
        this.ID = newID;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setDOB(Date newDOB){
        this.DOB = newDOB;
    }
    public double setSalary(double newSalary){
        return this.salary = newSalary;
    }
    public int getAge(){
        Date curDate = new Date();
        return curDate.getYear() - this.DOB.getYear();
    }
    public void increaseSalary(){
        this.salary *= 1.1;
    }
}
// Alt + Enter để lấy thư viện