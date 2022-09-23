package Week9.measurements;

public class ConstantSensor implements Sensor{
    private int measuredValued;

    public ConstantSensor(int measuredValue) {
        this.measuredValued = measuredValue;
    }

    @Override
    public int measure() {
        return this.measuredValued;
    }
    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void on() {
    //do not do anything
    }

    @Override
    public void off() throws IllegalAccessException {

    }


}
