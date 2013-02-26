/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.model;

/**
 * A host service combination, to be used in servicegroups.
 * 
 * @author jester
 */
public class HostService {
    private Host host;
    private Service service;

    public HostService(Host host, Service service) {
        this.host = host;
        this.service = service;
    }

    public Host getHost() {
        return host;
    }

    public Service getService() {
        return service;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void setService(Service service) {
        this.service = service;
    }
    
}
