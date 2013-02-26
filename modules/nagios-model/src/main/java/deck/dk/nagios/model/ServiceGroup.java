/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.model;

import java.util.List;

/**
 *
 * @author Jesper Terkelsen
 */
public class ServiceGroup {
//    	servicegroup_name	sense
//	alias			Sense services
//	members			ixisen01,Opoint IP alias,ixisen01,Sense IP alias,ixisen01,Website MobileAPI,ixisen01,Website Opointsense,ixisen01,Website Sense,ixisen01,Website Sense CustomerAdmin,ixisen01,activemq,ixisen01,tomcat_ca,ixisen01,tomcat_mobileapi,ixisen01,tomcat_sense,ixisen02,tomcat_newsletter_finder,ixisen02,tomcat_newsletter_service,ixisen02,tomcat_sense
    private String name;
    private String alias;
    private List<HostService> members;
    
}
