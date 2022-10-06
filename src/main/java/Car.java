public class Car extends Vehicle{

    public Car(String id, String name, int velocity) {
        super(id, name, velocity);
    }

    @Override
    public int accelerate(int kmh) {
        setVelocity(getVelocity()+kmh);
        System.out.println("Die Geschwindigkeit wurde um " + kmh +  "km/h auf " + getVelocity() + "km/h erhöht");
        return getVelocity();
    }
}
