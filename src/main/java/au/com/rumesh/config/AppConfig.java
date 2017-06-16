package au.com.rumesh.config;

import au.com.rumesh.ui.Console;
import au.com.rumesh.ui.ConsoleImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by rnadeera on 8/6/17.
 */
@Configuration
@Import(PersistanceConfig.class)
//TODO: Add EnableJpaRepositories for CRUD is any
public class AppConfig {

    @Bean
    public Console console(){
        return new ConsoleImpl();
    }

    //TODO specify other beans
}
