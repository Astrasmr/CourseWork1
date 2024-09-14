package model;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String lastName;
    private int salary;
    private int department;
    private static int counter = 1;


    public Employee (String name, String lastName, int salary, int department) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.id = counter ++;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    public int getDepartment() {
        return department;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, salary, department);
    }
    public int getId()     {
        return id;
    }
public String getFullName () {
        return lastName + " " + name;

}


}

