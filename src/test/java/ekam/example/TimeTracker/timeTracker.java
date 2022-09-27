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
        System.out.println("Total time taken for this API to Respond is : "+(System.nanoTime()-getStartTime())+" Nanoseconds");
        return System.nanoTime()-getStartTime();
    }

}
