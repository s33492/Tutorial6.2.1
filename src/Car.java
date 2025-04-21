class Car extends Vehicle {
    private int numberOfSeats;
    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    @Override
    public void start() {
        System.out.println("Vehicle  stalled");
    }
    @Override
    public void stop() {
        System.out.println("Vehicle hasn't started");
    }
}
