package com.composite.department;

/**
 * @author yanzhihao
 * @since 2022/5/5
 */
public abstract class HumanResource {

    protected long id;

    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}
