package com.proxy_design_pattern;

public interface EmployeeDao {

    void create(String client, Employee employee) throws Exception;
    void delete(String client, int employeeId) throws Exception;
    void get(String client, int employeeId) throws Exception;
}
