package ch02.q09;

class Car {

    public static void main (String [] args) {
        Car honda = new Car();
        honda.drive(50);
        honda.drive(10);
        honda.drive(75);
    }

    double mileage;
    double gasRemaining;
    final double gasTankVolume;
    final double fuelEfficiency;

    public Car() {
        this.gasTankVolume = 65;
        this.gasRemaining = this.gasTankVolume; // start with full tank
        this.fuelEfficiency = 0.04;
        this.mileage = 0;
    }

    // drive by x miles
    public void drive(double miles) {
        this.mileage += miles;
        this.gasRemaining -= miles * this.fuelEfficiency;
        System.out.println("You just drove " + miles + " miles.\nYour mileage is now " + this.mileage + ".\nYou have " + this.gasRemaining + " litres of gas remaining.");
    }

    // add x gallons to tank
    public void fillGasTank(double litres) {
        this.gasRemaining += litres;
    }

    // current distance from origin
    public double distanceFromOrigin() {
        return this.mileage;
    }

    // current fuel level 
    public double fuelLevel() {
        return this.gasRemaining;
    }
}