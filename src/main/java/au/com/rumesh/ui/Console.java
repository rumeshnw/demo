package au.com.rumesh.ui;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.function.Consumer;

/**
 * Interface to handle CLI. Implement this to handle different CLI logic
 *
 * Created by rnadeera on 16/6/17.
 */
public interface Console {

    void startConsole();

    default void withScanner(Consumer<Scanner> consumer){
        Scanner scanner = new Scanner(System.in);
        try {
            consumer.accept(scanner);
        } finally {
            scanner.close();
        }
    }

    default String trimUserInput(Scanner scanner){
        return StringUtils.trimToNull(scanner.nextLine());
    }
}
