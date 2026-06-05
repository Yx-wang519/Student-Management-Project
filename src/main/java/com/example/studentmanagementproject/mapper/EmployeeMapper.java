package com.example.studentmanagementproject.mapper;

import com.example.studentmanagementproject.dto.EmployeeDto;
import com.example.studentmanagementproject.entity.Employee;

public class EmployeeMapper {
// Employee maps to Dto
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
// Dto maps to Employee
    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
