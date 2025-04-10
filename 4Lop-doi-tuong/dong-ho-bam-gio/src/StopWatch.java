public class StopWatch {
    double startTime;
    double endTime;
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = 0.0;
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }
    public double getElapsedTime() {
        if (endTime == 0.0) {
            return System.currentTimeMillis() - startTime;
        }
        return endTime - startTime;
    }
}
