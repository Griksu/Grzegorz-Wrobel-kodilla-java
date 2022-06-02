package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetrieveFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public RetrieveFacade(CompanyDao companyDao,EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompaniesWithName(String name) {
        return companyDao.retrieveCompanyWithStringOfCharsOfName(name);
    }

    public List<Employee> findEmployeesWithLastname(String lastname) {
        return employeeDao.retrieveEmployeeWithStringOfCharOfLastname(lastname);
    }
}
