package j4g.kotlinmaiden.command;

import j4g.kotlinmaiden.component.Command;
import j4g.kotlinmaiden.component.Name;

@Name("help")
@j4g.kotlinmaiden.component.Help(Help.HELP)
public class Help implements Command {
    public static final String HELP = "" +
            "Commands available: \n" +
            "  help - Show this message \n";

    public void execute(String[] args) {
        System.out.println(help());
    }
}
