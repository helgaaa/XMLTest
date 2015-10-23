/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.User;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HB
 */
@XmlRootElement
public class applicationState {
    
    @XmlElement
    private List<User> users;
    
    public applicationState() {
        users = new ArrayList<>();
    }
    
    public List<User> getUsers() {
        return users;
    }
    
}
