package predavanja.predavanja10_5banka;

public class BankStand {

    private int id;
    private static int cntID = 1;
    private float processingTime;
    private boolean statusProcessing;

    public BankStand(float processingTime) {
        this.processingTime = processingTime*id;
        id = cntID++;
        statusProcessing = true;
    }

    public void changeBankStatus(boolean newStatus) {
        statusProcessing = newStatus;
    }


}
