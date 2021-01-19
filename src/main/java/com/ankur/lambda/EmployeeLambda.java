package com.ankur.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.ankur.domain.Employee;
import com.ankur.service.EmployeeService;

public class EmployeeLambda implements RequestHandler<Integer,Employee> {
    @Override
    public Employee handleRequest(Integer id, Context context) {
        EmployeeService service = new EmployeeService();
        context.getLogger().log("SimpleLambda > handleRequest");
        context.getLogger().log("max memory allocated: "+context.getMemoryLimitInMB());

        return service.findById(id);
    }
}
