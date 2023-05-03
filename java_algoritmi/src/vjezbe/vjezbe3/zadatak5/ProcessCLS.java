package vjezbe.vjezbe3.zadatak5;

public class ProcessCLS {

    private int processID;
    private static int cntID = 10;
    private long processDuration;
    private long processingTime;
    private String processName;

    public ProcessCLS(String name, long timeDuration) {
        this.processName = name;
        this.processID = cntID++;
        this.processDuration = timeDuration;
        this.processingTime = 0;
        System.out.println("Created process");
    }

    public void setProcessDuration(long processDuration) {
        this.processDuration = processDuration;
    }

    public int getProcessID() {
        return processID;
    }

    public String getProcessName() {
        return processName;
    }

    public boolean isFinished() {
        return processDuration >= processingTime;
    }

    public boolean processingStep(long timeElapsed) {
        processingTime += timeElapsed;
        return processingTime < processDuration;
    }

    @Override
    public String toString() {
        return "{" +
                "duration=" + processDuration +
                ", processingTime=" + processingTime +
                ", processName='" + processName + '\'' +
                '}';
    }
}
