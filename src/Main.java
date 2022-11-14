public class Main {

    public static void main(String[] args) {
        Auto MyCar = new Auto();
        MyCar.Name = Auto.Name.YARIS;
        MyCar.power = 1000;
        MyCar.weight = 2000;
        MyCar.Type = Auto.Type.HATCHBACK;

        Engine MyEngine = new Engine();
        SteeringWheel MySteeringWheel = new SteeringWheel();

        System.out.println(MyCar.Name + " is " + MyCar.Type + " which weights " + MyCar.weight + " and has power " + MyCar.power + " did the following: ");
        MyEngine.startEngine();
        MySteeringWheel.turnLeft();
        MySteeringWheel.turnRight();
        MyEngine.stopEngine();

    }
}
