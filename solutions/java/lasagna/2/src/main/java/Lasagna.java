public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        return this.expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layersNumb) {
        return layersNumb * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layersNumb, int bakingTime) {
        return preparationTimeInMinutes(layersNumb) + bakingTime;
    }
}
