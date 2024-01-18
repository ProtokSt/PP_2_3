package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    // Duck5 and Egg6 wired via @Bean, getter, AppConfig
    // And autowire Needle7 - argument of getter Bean and @Component
    @Autowired
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
