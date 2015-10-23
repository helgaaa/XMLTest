/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.User;
import java.nio.file.FileSystem;
import java.util.List;

/**
 *
 * @author HB
 */
public class repoUser {

    public User getUserById(String id){
        for (User user : users()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
    
    public List<User> getUsers(){
        return users();
    }
    
    public void addUser(User user){
        users().add(user);
        XMLDataHandler.getAppInstance().saveState();
    }
    
    public List<User> users(){
        return XMLDataHandler.getAppInstance().getState().getUsers();
    }
}
