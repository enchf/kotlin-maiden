package j4g.kotlinmaiden;

public class App {

    private static final String HELP = "" +
            "Commands available: \n" +
            "  help - Show this message \n" +
            "  greet <name> - Greets a person \n" +
            "  blame <name> - Blames against someone \n";

    public static void main(String...args) {
        String command = args.length > 0 ? args[0] : "";

        switch (command) {
            case "help":
                System.out.println(HELP);
                break;
            case "greet":
                System.out.println("Hello " + (args.length > 1 ? args[1] : ""));
                break;
            case "blame":
                System.out.println("%&/@$ " + (args.length > 1 ? args[1] : ""));
                break;
            default:
                throw new RuntimeException("Unknown command: " + command);
        }
    }
}
