package predavanja.predavanja10_5banka;

public class Customer {

    private String name;
    private int id;
    private int cntID;

    public Customer(String name) {
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
