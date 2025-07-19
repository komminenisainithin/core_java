public class CarInfo {
    public static void main(String[] args) {
        String carBrand = "Mahindra";
        String carType = "SUV";
        String engineType = "mHAWK 4 Cylinder";
        short displacement= 1497;
        String maxPower = "130bhp @ 3750rpm";
        String maxTorque = "300Nm @ 1600-2800rpm";
        byte numberOfCylinders = 4;
        byte valvesPerCylinder = 4;
        String fuelSupplySystem = "CRDi";
        boolean hasTurboCharger = true;
        String transmissionType = "Manual";
        String gearbox = "6-Speed";
        String driveType = "RWD";

        System.out.println("Car Details");
        System.out.println("carbrand:"+ carBrand);
        System.out.println("car type:"+ carType);
        System.out.println("engine type:"+ engineType);
        System.out.println("displacement:"+ displacement+" cc");
        System.out.println("max power:"+ maxPower);
        System.out.println("max torque:"+ maxTorque);
        System.out.println("number of cylinders:"+ numberOfCylinders);
        System.out.println("valves per cylinder:"+ valvesPerCylinder);
        System.out.println("fuel supply system:"+ fuelSupplySystem);
        System.out.println("has turbo charger:"+ hasTurboCharger);
        System.out.println("transmission type:"+ transmissionType);
        System.out.println("gearbox:"+ gearbox);
        System.out.println("drive type:"+ driveType);

    }
    
}
