/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deck.dk.nagios.model.nrpe;

/**
 * <p>Definition of a nrpe command, to be added in nrpe.cfg on the server.</p>
 * Example:
 * <pre>
 * command[check_users]=/usr/local/nagios/libexec/check_users -w $ARG1$ -c $ARG2$
 * </pre>
 * <p>
 *  Documentation is here: <a href="http://nagios.sourceforge.net/docs/nrpe/NRPE.pdf">http://nagios.sourceforge.net/docs/nrpe/NRPE.pdf</a>
 * </p>
 * @author jester
 */
public class NrpeCommand {
    private String commandName;
    private String command;

    public NrpeCommand() {
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
    
    
}
