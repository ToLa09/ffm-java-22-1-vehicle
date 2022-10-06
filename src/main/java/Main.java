public class Main {
    public static void main(String[] args) {
        Vehicle tobiasAuto = new Car("L-T9","Opel",30);
        tobiasAuto.accelerate(10);


        Vehicle tobiasBike = new Bicycle("LT", "Rennrad", 10);
        tobiasBike.accelerate(10);
        tobiasBike.accelerate(15);

    }
}