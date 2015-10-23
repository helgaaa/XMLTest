/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmltest;

import Data.XMLDataHandler;
import Data.repoUser;
import Model.User;
import Data.repoUser;
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
        
        User anett = userRepo.getUserById("A01");
        User helga = userRepo.getUserById("H02");
        
        if (anett == null) {
            anett = new User();
            anett.setId("A01");
            anett.setName("Anett");
            users.add(anett);
        }
        
        if (helga == null) {
            helga = new User();
            helga.setId("H02");
            helga.setName("Helga");
            users.add(helga);
        }
        
        XMLDataHandler.getAppInstance().saveState();
    }
    
}
