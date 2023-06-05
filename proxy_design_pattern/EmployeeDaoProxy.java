package com.proxy_design_pattern;

public class EmployeeDaoProxy implements EmployeeDao {
    private EmployeeDao employeeDao;

    public EmployeeDaoProxy(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public void create(String client, Employee employee) throws Exception {
        if(client.equals("ADMIN")) {
            System.out.println("created an account");
            return;
        }
        throw new Exception("access denied!");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN")) {
            System.out.println("deleted an account");
            return;
        }
        throw new Exception("access denied!");
    }

    @Override
    public void get(String client, int employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            System.out.println("fetched an account");
            return;
        }
        throw new Exception("access denied!");
    }
}
