package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {
    // Needle7 and Deth8 wired via constructor
    private Deth8 deth;
    public Needle7(Deth8 deth) {
        this.deth = deth;
    }
    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }
}
