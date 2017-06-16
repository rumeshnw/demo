package au.com.rumesh.ui;

/**
 * Created by rnadeera on 8/6/17.
 * @See Console
 */
public class ConsoleImpl implements Console {

    @Override
    public void startConsole() {
        Console.withScanner(scanner -> {
            System.out.println("Welcome to demo console");
            while (true){
                System.out.println("Please enter your name......");
                String consoleInput = scanner.nextLine();

                if (consoleInput.equals("EXIT")) {
                    System.out.println("Have a Nice Day !!!");
                    break;
                } else {
                    System.out.println("Hello " + consoleInput);
                }
            }
        });
    }

}
