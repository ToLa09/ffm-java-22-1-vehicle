public abstract class Vehicle implements Acceleratable{
    private String id;
    private String name;
    private int velocity;

    public Vehicle(String id, String name, int velocity) {
        this.id = id;
        this.name = name;
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
}
