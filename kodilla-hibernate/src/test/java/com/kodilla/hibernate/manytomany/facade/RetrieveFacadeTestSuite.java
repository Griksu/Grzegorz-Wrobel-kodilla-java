package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RetrieveFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private RetrieveFacade retrieveFacade;

    @Test
    public void testCompanyFindFacade() {
        //Given
        Company bigTechCompany = new Company("Big Tech Company");
        Company mediumMedCompany = new Company("Medium Med Company");
        Company smallEduCompany = new Company("Small Edu Company");

        Employee jackSparrow = new Employee("Jack", "Sparrow");
        Employee mikeEagle = new Employee("Mike", "Eagle");
        Employee larryBird = new Employee("Larry", "Bird");

        bigTechCompany.getEmployees().add(jackSparrow);
        bigTechCompany.getEmployees().add(mikeEagle);
        mediumMedCompany.getEmployees().add(mikeEagle);
        mediumMedCompany.getEmployees().add(larryBird);
        smallEduCompany.getEmployees().add(larryBird);
        smallEduCompany.getEmployees().add(jackSparrow);

        jackSparrow.getCompanies().add(bigTechCompany);
        jackSparrow.getCompanies().add(smallEduCompany);
        mikeEagle.getCompanies().add(bigTechCompany);
        mikeEagle.getCompanies().add(mediumMedCompany);
        larryBird.getCompanies().add(mediumMedCompany);
        larryBird.getCompanies().add(smallEduCompany);

        //When
        companyDao.save(bigTechCompany);
        int bigTechCompanyId = bigTechCompany.getId();
        companyDao.save(mediumMedCompany);
        int mediumMedCompanyId = mediumMedCompany.getId();
        companyDao.save(smallEduCompany);
        int smallEduCompanyId = smallEduCompany.getId();
        employeeDao.save(jackSparrow);
        int jackSparrowId = jackSparrow.getId();
        employeeDao.save(mikeEagle);
        int mikeEagleId = mikeEagle.getId();
        employeeDao.save(larryBird);
        int larryBirdId = larryBird.getId();

        List<Company> companyNameByStringComp = retrieveFacade.findCompaniesWithName("%Comp%");
        List<Employee> employeeLastnameByStringBird = retrieveFacade.findEmployeesWithLastname("%Bird%");
        List<Company> companyNameByStringEd = retrieveFacade.findCompaniesWithName("%ed%");
        List<Employee> employeeLastnameByStringR = retrieveFacade.findEmployeesWithLastname("%r%");

       //Then
        assertNotEquals(0, bigTechCompanyId);
        assertNotEquals(0, mediumMedCompanyId);
        assertNotEquals(0, smallEduCompanyId);
        assertNotEquals(0, jackSparrowId);
        assertNotEquals(0, mikeEagleId);
        assertNotEquals(0, larryBirdId);
        assertEquals(3, companyNameByStringComp.size());
        assertEquals(1, employeeLastnameByStringBird.size());
        assertEquals(2, companyNameByStringEd.size());
        assertEquals(2,employeeLastnameByStringR.size());

        //CleanUp
        try {
            companyDao.deleteById(bigTechCompanyId);
            companyDao.deleteById(mediumMedCompanyId);
            companyDao.deleteById(smallEduCompanyId);
            employeeDao.deleteById(jackSparrowId);
            employeeDao.deleteById(mikeEagleId);
            employeeDao.deleteById(larryBirdId);
        } catch (Exception e) {
            //do nothing
        }
    }
}