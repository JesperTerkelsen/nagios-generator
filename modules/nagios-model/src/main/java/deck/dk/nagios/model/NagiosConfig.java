/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Root/holder class, for containing a nagios configuiration.
 * @author jester
 */
public class NagiosConfig {
    private List<Host> hosts = new ArrayList<Host>();
    private List<Service> services = new ArrayList<Service>();

    public List<Host> getHosts() {
        return hosts;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setHosts(List<Host> hosts) {
        this.hosts = hosts;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
    
}
