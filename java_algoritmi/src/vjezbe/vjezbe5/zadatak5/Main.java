package vjezbe.vjezbe5.zadatak5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(39);

        // Rasporediti brojeve od 1 do 39 u cirkulani red
        for (int i = 1; i <= 39; i++) {
            circularQueue.enqueue(i);
        }

        // Simulacija igre s tri igrača
        int player1Score = 0;
        int player2Score = 0;
        int player3Score = 0;

        Random random = new Random();

        System.out.println("Igra započinje!");

        for (int round = 1; round <= 7; round++) {
            System.out.println("----- Round " + round + " -----");

            // Igrač 1
            int player1Number = circularQueue.dequeue();
            if (player1Number % 2 != 0) {
                player1Score++;
            }
            System.out.println("Igrač 1: Broj " + player1Number + (player1Number % 2 != 0 ? " (NEPARNI)" : ""));

            // Igrač 2
            int player2Number = circularQueue.dequeue();
            if (player2Number % 2 != 0) {
                player2Score++;
            }
            System.out.println("Igrač 2: Broj " + player2Number + (player2Number % 2 != 0 ? " (NEPARNI)" : ""));

            // Igrač 3
            int player3Number = circularQueue.dequeue();
            if (player3Number % 2 != 0) {
                player3Score++;
            }
            System.out.println("Igrač 3: Broj " + player3Number + (player3Number % 2 != 0 ? " (NEPARNI)" : ""));

            // Vratiti brojeve natrag u red
            circularQueue.enqueue(player1Number);
            circularQueue.enqueue(player2Number);
            circularQueue.enqueue(player3Number);

            System.out.println("Stanje bodova nakon ovog kruga:");
            System.out.println("Igrač 1: " + player1Score + " bodova");
            System.out.println("Igrač 2: " + player2Score + " bodova");
            System.out.println("Igrač 3: " + player3Score + " bodova");
            System.out.println("---------------------");
        }

        // Pronaći pobjednika
        int maxScore = Math.max(player1Score, Math.max(player2Score, player3Score));
        if (maxScore == player1Score) {
            System.out.println("Pobjednik je igrač 1 sa " + player1Score + " neparnih brojeva.");
        } else if (maxScore == player2Score) {
            System.out.println("Pobjednik je igrač 2 sa " + player2Score + " neparnih brojeva.");
        } else {
            System.out.println("Pobjednik je igrač 3 sa " + player3Score + " neparnih brojeva.");
        }
    }
}

