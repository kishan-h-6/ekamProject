package ekam.example.TimeTracker;

public class timeTracker {
    private long startTime;

    public timeTracker(){
        startTime=System.nanoTime();
    }
    public long getStartTime() {
        return startTime;
    }

    public long stop() {
        return System.nanoTime()-getStartTime();
    }

}
