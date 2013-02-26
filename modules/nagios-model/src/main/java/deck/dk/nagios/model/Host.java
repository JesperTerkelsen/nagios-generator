/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Documented here
 * <a href="http://nagios.sourceforge.net/docs/3_0/objectdefinitions.html#host">http://nagios.sourceforge.net/docs/3_0/objectdefinitions.html#host</a></p>
 * 
 * @author Jesper Terkelsen
 */
public class Host {
    private String hostName; // Short hostname
    private String alias; // Alias
    private String address; // DNS hostname
    private String use; // Define template to use
    private List<String> parents = new ArrayList<String>();
    private List<String> hostGroups = new ArrayList<String>();
    private List<String> contactGroups = new ArrayList<String>();

    public Host() {
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public List<String> getParents() {
        return parents;
    }

    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    public List<String> getHostGroups() {
        return hostGroups;
    }

    public void setHostGroups(List<String> hostGroups) {
        this.hostGroups = hostGroups;
    }

    public List<String> getContactGroups() {
        return contactGroups;
    }

    public void setContactGroups(List<String> contactGroups) {
        this.contactGroups = contactGroups;
    }

}
