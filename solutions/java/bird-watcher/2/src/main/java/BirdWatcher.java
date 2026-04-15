import java.util.Arrays;
import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;
    private final int lastIndex;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.lastIndex = birdsPerDay.length - 1;
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[lastIndex];
    }

    public void incrementTodaysCount() {
        birdsPerDay[lastIndex]++;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(birdsWatched -> birdsWatched == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        IntStream limitedArr = Arrays.stream(birdsPerDay).limit(Math.min(numberOfDays, 7));
        return limitedArr.sum();
    }

    public int getBusyDays() {
        IntStream greaterThanFour = Arrays.stream(birdsPerDay).filter(birdsCounter -> birdsCounter > 4);
        return Math.toIntExact(greaterThanFour.count());
    }
}
