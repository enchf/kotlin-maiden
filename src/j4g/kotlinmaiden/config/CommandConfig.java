package j4g.kotlinmaiden.config;

import j4g.kotlinmaiden.command.Blame;
import j4g.kotlinmaiden.command.Greet;
import j4g.kotlinmaiden.command.Help;
import j4g.kotlinmaiden.component.Command;
import j4g.kotlinmaiden.component.Executable;

import java.util.*;
import java.util.stream.Stream;

public class CommandConfig {

    private static final Command[] FUNCTIONAL_COMMANDS = { new Greet(), new Blame() };
    private static final Command HELP = new Help();

    private static final Map<String, Executable> COMMAND_MAP = buildFullMap();
    private static final Map<String, Command> FUNCTIONAL_COMMAND_MAP = buildMap(false);

    public static Map<String, Command> allFunctionalCommands() {
        return FUNCTIONAL_COMMAND_MAP;
    }

    public static Map<String, Executable> allCommands() {
        return COMMAND_MAP;
    }

    private static Map<String, Command> buildMap(boolean includeHelp) {
        Map<String, Command> commandMap = new HashMap<>();
        Stream<Command> commands = Arrays.stream(FUNCTIONAL_COMMANDS);

        if (includeHelp) commands = Stream.concat(commands, Stream.of(HELP));

        commands.forEach(command -> commandMap.put(command.id(), command));

        return Collections.unmodifiableMap(commandMap);
    }

    private static Map<String, Executable> buildFullMap() {
        Map<String, Executable> fullMap = new HashMap<>(buildMap(true));
        return Collections.unmodifiableMap(fullMap);
    }
}
