package vjezbe.vjezbe5.zadatak4;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    private static LinkedList<Person> overflow = new LinkedList<>();

    public static void main(String[] args) {

        LinkedBlockingQueue<Person> blockingQueue = new LinkedBlockingQueue<>(8);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        status(blockingQueue);
        processing(blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        status(blockingQueue);
        processing(blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        blockingQueue = add2Queue(new Person(), blockingQueue);
        status(blockingQueue);
        System.out.println(overflow);



    }

    private static LinkedBlockingQueue<Person> add2Queue(Person prs, LinkedBlockingQueue<Person> wts) {

        if(wts.remainingCapacity() > 0) {

            if(!overflow.isEmpty()) {
                wts.add(overflow.getFirst());
            }else {
                wts.add(prs);
            }

        } else {
            overflow.add(prs);
        }

        return wts;

    }

    private static void status(LinkedBlockingQueue<Person> wts) {

        for(Person prs : wts) {
            System.out.println("In the queue -> " + prs.getName());
        }
        System.out.println("Status -> empty " + wts.remainingCapacity());
    }

    private static void processing(LinkedBlockingQueue<Person> wts) {
        try {
            Person prs = wts.take();
            System.out.println("Processing -> " + prs.getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
