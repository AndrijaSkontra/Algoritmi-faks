package predavanja.predavanja10_5banka;

import predavanja.predavanja10_5.QueueArr;

import java.util.Set;
import java.util.TreeSet;

public class Bank {

    private String bankName;
    private int id;
    private static int cntID = 100;
    private Set<BankStand> stands;
    private QueueArr<Customer> queue;
    private final int BANKCAP = 30;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.id = cntID++;
        this.stands = new TreeSet<>();
        queue = new QueueArr<>(BANKCAP);
    }

    public void addStand(BankStand stand) {
        stands.add(stand);
    }

    public void addCustomerToQueue(Customer customer) {
        queue.enqueue(customer);
    }

    public void startTransactionsOnBankStands() {
        // TODO
    }


}
