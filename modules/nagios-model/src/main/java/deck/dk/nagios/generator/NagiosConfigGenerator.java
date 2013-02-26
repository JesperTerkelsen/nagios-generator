/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.generator;

import deck.dk.nagios.model.Host;
import deck.dk.nagios.model.NagiosConfig;
import deck.dk.nagios.model.Service;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author jester
 */
public class NagiosConfigGenerator {

    public void generateConfig(File directory, NagiosConfig config) {
        List<Service> services = config.getServices();
        for (Host host : config.getHosts()) {
            String hostDefinition = getHostDefinition(host);
            System.out.println(hostDefinition);
            for (Service service : services) {
                if (service.getHost().getHostName().equals(host.getHostName())){
                    System.out.println(getServiceDefinition(service));
                }
            }
        }
        // Find services that did not have a host definition, and add grouped by hosts.
        
    }

    private static final String TAB = "  ";
    private static final String NEWLINE = System.getProperty("line.separator");
    
    private String getServiceDefinition(Service service){
        StringBuilder sb = new StringBuilder();
        sb.append("define service {").append(NEWLINE);
        if (!isEmpty(service.getUse())){
            sb.append(TAB).append("use ").append(service.getUse()).append(NEWLINE);
        }
        if (!isEmpty(service.getHost().getHostName())){
            sb.append(TAB).append("host_name ").append(service.getHost().getHostName()).append(NEWLINE);
        }
        if (!isEmpty(service.getServiceDescription())){
            sb.append(TAB).append("service_description ").append(service.getServiceDescription()).append(NEWLINE);
        }
        if (!isEmpty(service.getCheckCommand())){
            sb.append(TAB).append("check_command ").append(service.getCheckCommand()).append(NEWLINE);
        }
        if (!service.getContactGroups().isEmpty()){
            sb.append(TAB).append("contact_groups ").append(commaSeperated(service.getContactGroups())).append(NEWLINE);
        }        
        sb.append("}").append(NEWLINE);
        return sb.toString();        
    }
    
    private String getHostDefinition(Host host) {
        StringBuilder sb = new StringBuilder();
        sb.append("define host {").append(NEWLINE);
        if (!isEmpty(host.getUse())){
            sb.append(TAB).append("use ").append(host.getUse()).append(NEWLINE);
        }
        if (!isEmpty(host.getHostName())){
            sb.append(TAB).append("host_name ").append(host.getHostName()).append(NEWLINE);
        }
        if (!isEmpty(host.getAlias())){
            sb.append(TAB).append("alias ").append(host.getAlias()).append(NEWLINE);
        }
        if (!isEmpty(host.getAddress())){
            sb.append(TAB).append("address ").append(host.getAddress()).append(NEWLINE);
        }
        if (!host.getParents().isEmpty()){
            sb.append(TAB).append("parents ").append(commaSeperated(host.getParents())).append(NEWLINE);
        }
        if (!host.getHostGroups().isEmpty()){
            sb.append(TAB).append("hostgroups ").append(commaSeperated(host.getHostGroups())).append(NEWLINE);
        }
        if (!host.getContactGroups().isEmpty()){
            sb.append(TAB).append("contact_groups ").append(commaSeperated(host.getContactGroups())).append(NEWLINE);
        }
        sb.append("}").append(NEWLINE);
        return sb.toString();
    }
    
    private String commaSeperated(List<String> values){
        StringBuilder sb = new StringBuilder();
        for (Iterator<String> it = values.iterator(); it.hasNext();) {
            String string = it.next();
            sb.append(string);
            if (it.hasNext()){
                sb.append(",");
            }
        }
        return sb.toString();
    }
    
    private boolean isEmpty(String value){
        if (value == null || value.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
