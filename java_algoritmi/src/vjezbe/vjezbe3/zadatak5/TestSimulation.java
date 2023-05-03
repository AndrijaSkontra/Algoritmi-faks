package vjezbe.vjezbe3.zadatak5;

import vjezbe.vjezbe3.zadatak4.CircularLinkedList;

public class TestSimulation {

    private static CircularLinkedList<ProcessCLS> cllList;

    public static void main(String[] args) {
        cllList = new CircularLinkedList<>();
        System.out.println(cllList);
        ProcessCLS p1 = new ProcessCLS("p1", 1000);
        ProcessCLS p2 = new ProcessCLS("p2", 2500);
        ProcessCLS p3 = new ProcessCLS("p3", 3000);

        cllList.addFirst(p1);
        cllList.addFirst(p2);
        cllList.addLast(p3);
        System.out.println(cllList);
        simRoundRobin(10, cllList, 500);
    }

    private static void simRoundRobin(int cycles, CircularLinkedList<ProcessCLS> processes, long alocatedTime){

        if(processes.isEmpty()){
            System.out.println("CPU is idle - nothing to process!");
        } else {
            System.out.println("Number of processes to simulate: " + processes.size());
            System.out.println("Simulating Round Robin with " + cycles + " cycles and " + alocatedTime + " time for process");
            System.out.println("----------------------------------------------------------------------------------------------------");
            for (int k = 0; k < cycles; k++) {
                if(processes.isEmpty()) {
                    System.out.println("CPU finished all processes - out from looping.");
                    break;
                } else {
                    ProcessCLS actual = processes.getFirst();
                    System.out.println("CPU fetched: " + actual);
                    if (actual.processingStep(alocatedTime)) {
                        processes.rotate();
                    } else {
                        processes.removeFirst();
                    }
                }
            }
            System.out.println("Processes left: " + processes.size());
            System.out.println(processes);
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }
}
