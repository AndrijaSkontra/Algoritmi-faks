package predavanja.predavanja10_5banka;

public class Customer {

    private String name;
    private int age;

    public Customer() {
        this.name = AUXCLS.generateRandomName();
        this.age = AUXCLS.generateRandomAge();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
