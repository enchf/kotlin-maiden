package j4g.kotlinmaiden;
import j4g.kotlinmaiden.component.Executable;
import j4g.kotlinmaiden.config.CommandConfig;

import java.util.Arrays;

public class App {
    public static void main(String...args) {
        Executable invalid = commandArgs -> System.out.println("Invalid args: " + Arrays.toString(args));
        CommandConfig.allCommands().getOrDefault(args[0], invalid).accept(args);
    }
}
