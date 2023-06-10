package vjezbe.vjezbe5.zadatak4;

import java.util.UUID;

public class Person {
    
    private String name;
    private int id;
    private static int cntId;
    
    public Person (){
        this.name = UUID.randomUUID().toString();
        this.id = cntId++;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Object{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
