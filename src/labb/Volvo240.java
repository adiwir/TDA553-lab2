package labb;

import java.awt.*;

public class Volvo240 extends Car{

    private HasTrim trim = new HasTrim(1.25);

    public Volvo240() {
        super(4, 100, Color.black, "Volvo240");
        stopEngine();
    }
    
    @Override
    protected double speedFactor() {
        return this.getEnginePower() * 0.01 * trim.getTrimFactor();
    }
}
