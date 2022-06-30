package j4g.kotlinmaiden.command;

import j4g.kotlinmaiden.component.Command;
import j4g.kotlinmaiden.component.Name;
import j4g.kotlinmaiden.config.CommandConfig;

import java.util.Optional;

@Name("help")
@j4g.kotlinmaiden.component.Help(Help.HELP)
public class Help implements Command {
    public static final String HELP = "Commands available: greet, blame. Type help <command> for a detailed description";

    public void execute(String[] args) {
        String helpMessage = args.length > 1 ? commandHelp(args[1]) : HELP;
        System.out.println(helpMessage);
    }

    private static String commandHelp(String command) {
        return Optional
                .ofNullable(CommandConfig.allFunctionalCommands().get(command))
                .map(Command::help)
                .orElse(HELP);
    }
}
