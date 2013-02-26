/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.generator;

import deck.dk.nagios.model.Host;
import deck.dk.nagios.model.NagiosConfig;
import deck.dk.nagios.model.Service;
import java.io.File;
import junit.framework.TestCase;

/**
 *
 * @author jester
 */
public class NagiosConfigGeneratorTest extends TestCase {
    
    public NagiosConfigGeneratorTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of generateConfig method, of class NagiosConfigGenerator.
     */
    public void testGenerateConfig() {
        System.out.println("generateConfig");
        File directory = new File("target/nagios");
        directory.mkdirs();
        NagiosConfig config = new NagiosConfig();
        Host host = new Host();
        host.setAddress("myhost.deck.dk");
        host.setHostName("myhost");
        host.setAlias("A longer host description");
        host.setUse("generic-host");
        host.getParents().add("router-01");
        host.getParents().add("router-02");
        host.getHostGroups().add("hostgroup01");
        host.getHostGroups().add("hostgroup02");
        host.getContactGroups().add("operations");
        config.getHosts().add(host);
        
        Service service = new Service();
        service.setHost(host);
        service.setUse("generic-service");
        service.setServiceDescription("check-disk-sda1");
        service.setDisplayName("Check disk: sda1");
        service.setCheckCommand("check-disk!/dev/sda1");
        service.getContactGroups().add("operations");
        
        NagiosConfigGenerator instance = new NagiosConfigGenerator();
        instance.generateConfig(directory, config);
    }
}
