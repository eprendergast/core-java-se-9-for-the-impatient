package ch03.q01;

public class Employee implements Measurable {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("John", 8.25),
            new Employee("Lisa",10.75),
            new Employee("Joe", 9.15)
        };

        double averageSalary = Measurable.average(employees);
        System.out.println("The average salary is: " + Measurable.roundToTwoDecimalPlaces(averageSalary));
        System.out.println("The employee with the largest salary is " + ((Employee) Measurable.largest(employees)).name);
    }

    String name;
    Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getMeasure() {
        return this.salary;
    }

}
