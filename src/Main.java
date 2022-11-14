public class Main {

    public static void main(String[] args) {
        Auto MyCar = new Auto();
        MyCar.name = Auto.name.YARIS;
        MyCar.power = 1000;
        MyCar.weight = 2000;
        MyCar.type = Auto.type.HATCHBACK;


        Engine MyEngine = new Engine();
        SteeringWheel MySteeringWheel = new SteeringWheel();

        System.out.println(MyCar.name + " is " + MyCar.type + " which weights " + MyCar.weight + " and has power " + MyCar.power + " did the following: ");
        InternalCombustionEngineCar.startEngine();
        MySteeringWheel.turnLeft();
        MySteeringWheel.turnRight();
        InternalCombustionEngineCar.stopEngine();



        Auto Tesla = new Auto();
        Tesla.name = Auto.name.OPA;
        Tesla.power = 900;
        Tesla.weight = 800;
        Tesla.type = Auto.type.PICKUP;

        System.out.println(Tesla.name + " is " + Tesla.type);
        ElectroCar TeslaEngine = new ElectroCar();
        TeslaEngine.startEngine();



    }
}
