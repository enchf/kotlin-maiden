package j4g.kotlinmaiden.component;

import java.util.Arrays;

@FunctionalInterface
public interface Command extends Executable, Identifiable<String>, Validable, Helpable {

    default void accept(String[] args) {
        if (test(args)) execute(args);
        else throw new RuntimeException("Invalid args: " + Arrays.toString(args));
    }

    default String id() {
        return getClass().getAnnotation(Name.class).value();
    }

    default boolean test(String[] args) {
        return true;
    }

    default String help() {
        return getClass().getAnnotation(Help.class).value();
    }

    void execute(String[] args);
}
