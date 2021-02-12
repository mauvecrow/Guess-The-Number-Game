package quangson.brad.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import quangson.brad.GuessCount;
import quangson.brad.MaxNumber;
import quangson.brad.MinNumber;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages="quangson.brad")
public class GameConfig {

    // == fields ==
    @Value("${game.maxNumber:20}") //can set default via ":#". eg: {game.maxNumber:20}
    private int maxNumber;

    @Value("${game.guessCount}")
    private int guessCount;

    @Value("${game.minNumber}")
    private int minNumber;

    // == bean methods ==
    @Bean
    @MaxNumber
    public int maxNumber1(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount1(){
        return guessCount;
    }

    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }
}
