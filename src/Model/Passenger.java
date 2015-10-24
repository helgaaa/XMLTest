/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author HB
 */
public class Passenger extends User {
    @XmlElement
    private final String userType = "Passenger";
}
