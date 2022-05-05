package com.composite.department;

/**
 * 員工
 * @author yanzhihao
 * @since 2022/5/5
 */
public class Employee extends HumanResource {

    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
