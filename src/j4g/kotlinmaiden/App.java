package j4g.kotlinmaiden;

import j4g.kotlinmaiden.command.Blame;
import j4g.kotlinmaiden.command.Greet;
import j4g.kotlinmaiden.command.Help;
import j4g.kotlinmaiden.component.Command;
import j4g.kotlinmaiden.component.Executable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String...args) {
        Map<String, Executable> commands = new HashMap<>();
        Command[] executables = { new Greet(), new Blame(), new Help() };
        Executable invalid = commandArgs -> { throw new RuntimeException("Invalid Command"); };

        Arrays.stream(executables).forEach(command -> commands.put(command.id(), command));

        commands.getOrDefault(args[0], invalid).accept(args);
    }
}
