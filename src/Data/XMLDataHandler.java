/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.User;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author HB
 */
public class XMLDataHandler {
    private String myFile = "myFile.xml";
    private applicationState myAppState;
    
    private static XMLDataHandler appInstance;
    private XMLDataHandler() {
        myAppState = new applicationState();
    }
    
    //*Ez nem lehetne a konstruktorban?*//
    public static XMLDataHandler getAppInstance(){
        if (appInstance == null) {
            appInstance = new XMLDataHandler();
            appInstance.loadState();
        }
        return appInstance;
    }
    
    public void loadState(){
        try {
            File file = new File(myFile);
            System.out.println("Loading state from " + file.getAbsolutePath());
            
            //From XML to Java object
            JAXBContext jaxbContext = JAXBContext.newInstance(applicationState.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            myAppState = (applicationState) jaxbUnmarshaller.unmarshal(file);

        } catch (Exception ex) {
            System.out.println("Could not load application state");
            System.out.println(ex);
        }
    }
    
    public void saveState() {
        try {
            File file = new File(myFile);
            System.out.println("Saving state to " + file.getAbsolutePath());
            
            //From Java object to XML
            JAXBContext jaxbContext = JAXBContext.newInstance(applicationState.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(myAppState, file);
            jaxbMarshaller.marshal(myAppState, System.out);

        } catch (JAXBException ex) {
            System.out.println("Could not save application state.");
            System.out.println(ex);
        }
    }
    
    public applicationState getState(){
        return myAppState;
    }
}
