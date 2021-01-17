import java.util.Scanner;

public class Calcolatrice extends Thread {
    private String operazione;


    public Calcolatrice() {
        this.operazione = operazione;
    }


    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("*********************");
            Scanner scanner = new Scanner(System.in);
            System.out.printf("***= N1:");
            float n1 = scanner.nextFloat();
            System.out.printf("***= N2:");
            float n2 = scanner.nextFloat();
            System.out.println("*** Scegliere l'operazione ***");
            operazione = scanner.next();
            Operazione op = new Operazione(n1,n2,operazione);
            op.run();
                       }
            System.out.println("*********************\n");
        }
    }
