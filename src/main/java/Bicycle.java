public class Bicycle extends Vehicle{

    public Bicycle(String id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        if ((getVelocity()+ kmh) <= 35) {
            setVelocity(getVelocity()+kmh);
            System.out.println("Die Geschwindigkeit wurde um " + kmh +  "km/h auf " + getVelocity() + "km/h erhöht");
            return getVelocity();
        } else {
            throw new RuntimeException("Maximalgeschwindigkeit wird überschritten");
        }
    }
}
