/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author HB
 */
//@XmlType(propOrder={"id", "userType", "name"})
@XmlSeeAlso({Employee.class, Passenger.class})
@XmlRootElement
public abstract class User {
    
    private String id;
    private String name;
    
    public String getId() {
        return id;
    }
    
    @XmlID
    @XmlElement
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

  
}
