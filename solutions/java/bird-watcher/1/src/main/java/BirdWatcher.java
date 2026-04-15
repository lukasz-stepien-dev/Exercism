
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int watchedBirds: birdsPerDay) {
            if (watchedBirds == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        numberOfDays = Math.min(numberOfDays, 7);
        int counter = 0;
        for (int i = 0; i < numberOfDays; i++) {
            counter += birdsPerDay[i];

        }
        return counter;
    }

    public int getBusyDays() {
        int counter = 0;
        for (int watchedBirds: birdsPerDay) {
            if (watchedBirds >= 5) {
                counter++;
            }
        }
        return counter;
    }
}
