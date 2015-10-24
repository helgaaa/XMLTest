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
import Model.Operator;
import Model.Passenger;
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
        
        List<User> users = userRepo.getUsers();
        
        Operator anett = (Operator) userRepo.getUserById("A01");
        Employee helga = (Employee) userRepo.getUserById("H02");
        Passenger tomi = (Passenger) userRepo.getUserById("T03");
        
        if (anett == null) {
            anett = new Operator();
            anett.setId("A01");
            anett.setName("Anett");
            users.add(anett);
        }
        
        if (helga == null) {
            helga = new Operator();
            helga.setId("H02");
            helga.setName("Helga");
            users.add(helga);
        }
        
        if (tomi == null) {
            tomi = new Passenger();
            tomi.setId("T03");
            tomi.setName("Tomi");
            users.add(tomi);
        }
        
        XMLDataHandler.getAppInstance().saveState();

    }
    
}
