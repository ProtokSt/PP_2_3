package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {
    // Ocean1 and Island2 wired via Bean, getter, AppConfig
    // And autowire Wood3 - argument of getter Bean and @Component

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
