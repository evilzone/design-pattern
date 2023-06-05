package com.proxy_design_pattern;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, Employee employee) throws Exception {
        System.out.println("created an employee");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        System.out.println("deleted an employee");
    }

    @Override
    public void get(String client, int employeeId) throws Exception {
        System.out.println("fetched an employee");
    }
}
