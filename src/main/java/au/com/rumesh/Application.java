package au.com.rumesh;

import au.com.rumesh.config.AppConfig;
import au.com.rumesh.ui.Console;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bootstrap class to start the application
 *
 * Created by rnadeera on 8/6/17.
 */
public class Application{

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Console console = ctx.getBean(Console.class);
        console.startConsole();
    }
}
