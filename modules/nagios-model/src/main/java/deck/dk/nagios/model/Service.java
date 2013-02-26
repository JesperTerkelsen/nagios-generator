/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Documented here
 * <a href="http://nagios.sourceforge.net/docs/3_0/objectdefinitions.html#service">http://nagios.sourceforge.net/docs/3_0/objectdefinitions.html#service</a></p>
 * 
 * @author Jesper Terkelsen
 */
public class Service {
    private String use;
    private Host host;
    private String serviceDescription; // The name for the service (should be one word, use dashes)
    private String displayName; // The displayname in the web frontend
    private String checkCommand; 
    private List<String> contactGroups = new ArrayList<String>();
    // max_check_attempts
    // normal_check_interval
        
    public Service() {
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getCheckCommand() {
        return checkCommand;
    }

    public void setCheckCommand(String checkCommand) {
        this.checkCommand = checkCommand;
    }

    public List<String> getContactGroups() {
        return contactGroups;
    }

    public void setContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    
}
