import java.util.Scanner;

public class Operazione implements OperazioneIO {
    private String operazione;
    private float n1;
    private float n2;

    public Operazione(float n1, float n2, String operazione) {
        this.operazione = operazione;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {
        float ris = 0;
        switch (operazione) {
            case "+" -> ris = somma(n1, n2);
            case "-" -> ris = sottrazione(n1, n2);
            case "*" -> ris = moltiplicazione(n1, n2);
            case "/" -> ris = divisione(n1, n2);
            default -> System.out.println("Inserito valore non valido");
        }
        System.out.println(ris);
    }


    @Override
    public float moltiplicazione(float n1, float n2) {
        return n1*n2;
    }

    @Override
    public float somma(float n1, float n2) {
        return n1+n2;
    }

    @Override
    public float divisione(float n1, float n2) {
        return n1/n2;
    }

    @Override
    public float sottrazione(float n1, float n2) {
        return n1-n2;
    }
}
