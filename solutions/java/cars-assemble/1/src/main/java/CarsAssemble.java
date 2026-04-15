public class CarsAssemble {
    private final int RATE = 221;

    public double productionRatePerHour(int speed) {
        int producedCars = speed * RATE;
        if (speed <= 4) {
            return producedCars;
        } else if (speed <= 8) {
            return producedCars * 0.9;
        } else if (speed == 9) {
            return producedCars * 0.8;
        } else {
            return producedCars * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
