import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("g", "Tung", new Date(106,12,25),1000);
        emp.getAge();
        System.out.println(emp.getAge());
        emp.increaseSalary();
        System.out.println(emp.getSalary());
    }
}