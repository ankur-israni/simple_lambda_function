package com.ankur.service;



import com.ankur.domain.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {

    private Map<Integer, Employee> db = new HashMap<>();

    public EmployeeService() {
        db.put(1, new Employee(1, "ankur", "plano"));
        db.put(2, new Employee(2, "prem", "irving"));
        db.put(3, new Employee(3, "ravi", "frisco"));
    }

    public Employee findById(Integer id) {
        Employee employee = db.get(id);
        if (employee != null) {
            System.out.println("employee is not null = " + employee);
            return employee;
        }
        return new Employee(-1, "cannot find employee", "unknown address");
    }


}
