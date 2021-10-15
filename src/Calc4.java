import java.util.Scanner;
public class Calc4 {
    public static void main(String [] args){
        int risultato;
        System.out.println("Benvenuto nella calcolatrice dei Fantastici 4");
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Digita il primo numero");
        int numeroA=inserisci.nextInt();
        System.out.println("Digita il seconda numero");
        int numeroB=inserisci.nextInt();

        Addizione faiLaSomma=new Addizione(numeroA,numeroB);
        risultato=faiLaSomma.somma();
        System.out.println("il risultato della somma di"+numeroA+" "+numeroB+" e' "+risultato);

        /* my part */
        Sottrazione object=new Sottrazione(numeroA,numeroB);
        risultato=object.SottOp();
        System.out.println("il risultato della sottrazione di"+numeroA+" and "+numeroB+" e' "+risultato);

    }



}
