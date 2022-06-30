package j4g.kotlinmaiden.command;

import j4g.kotlinmaiden.component.Command;
import j4g.kotlinmaiden.component.Help;
import j4g.kotlinmaiden.component.Name;

@Name("greet")
@Help("greet <name> - Greets a person")
public class Greet implements Command {
    @Override
    public boolean test(String[] args) {
        return args.length > 1;
    }

    @Override
    public void execute(String[] args) {
        System.out.println("Hello " + args[1]);
    }
}
