public class Employee {
    String name;
    double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void toString(String str){
        System.out.println("name is " + this.name + "\n" + "salary is " + this.salary);
    }
}
