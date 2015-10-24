/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;


import Model.Employee;
import Model.Operator;
import java.util.List;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author HB
 */
@XmlSeeAlso({Operator.class})
public class repoEmployee {

    public Employee getEmployeeById(String id){
        for (Employee employee : employees()) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }
    
    public List<Employee> getEmployees(){
        return employees();
    }
    
    public void addEmployee(Employee employee){
        employees().add(employee);
        XMLDataHandler.getAppInstance().saveState();
    }
    
    public List<Employee> employees(){
        return XMLDataHandler.getAppInstance().getState().getEmployeeList();
    }
}
