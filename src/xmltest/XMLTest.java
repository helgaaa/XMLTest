/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltest;

import Data.XMLDataHandler;
import Data.repoEmployee;
import Data.repoUser;
import Model.User;
import Data.repoUser;
import Model.Employee;
import java.util.List;

/**
 *
 * @author HB
 */
public class XMLTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        repoUser userRepo = new repoUser();
        repoEmployee employeeRepo = new repoEmployee();
        
        List<User> users = userRepo.getUsers();
        List<Employee> employees = employeeRepo.getEmployees();
        
        Employee anett = (Employee) userRepo.getUserById("A01");
        User helga = userRepo.getUserById("H02");
        
        if (anett == null) {
            anett = new Employee();
            anett.setId("A01");
            anett.setName("Anett");
            users.add(anett);
        }
        
        if (helga == null) {
            helga = new Employee();
            helga.setId("H02");
            helga.setName("Helga");
            users.add(helga);
        }
        
        XMLDataHandler.getAppInstance().saveState();

    }
    
}
