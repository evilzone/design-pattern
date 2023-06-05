package com.proxy_design_pattern;

public class Main {

    public static void main(String[] args) {
        EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy(employeeDaoImpl);
        try {
            employeeDaoProxy.create("USER", new Employee());
            System.out.println("operation successful");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
