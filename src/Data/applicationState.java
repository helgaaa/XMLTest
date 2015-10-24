/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Employee;
import Model.User;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HB
 */
@XmlRootElement
public class applicationState {
    
    @XmlElement
    private List<User> user;
    
    @XmlElement
    private List<Employee> employee;
    
    public applicationState() {
        user = new ArrayList<>();
    }
    
    public List<User> getUserList() {
        return user;
    }
    
    public List<Employee> getEmployeeList() {
        return employee;
    }
    
}
