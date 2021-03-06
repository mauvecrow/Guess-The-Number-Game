package quangson.brad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import quangson.brad.*;

@Configuration
@Import(GameConfig.class)
@ComponentScan(basePackages="quangson.brad")
public class AppConfig {

    // == bean method ==
//    @Bean
//    public NumberGenerator numberGenerator(){
//        return new NumberGeneratorImpl();
//    }

//    @Bean
//    public Game game(){
//        return new GameImpl();
//    }

//    @Bean
//    public MessageGenerator messageGenerator(){
//        return new MessageGeneratorImpl();
//    }
}
