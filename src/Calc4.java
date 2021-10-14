import java.util.Scanner;
public class Calc4 {
    public static void main(){
        System.out.println("Benvenuto nella calcolatrice dei Fantastici 4");
        Scanner inserisci = new Scanner(System.in);
        System.out.println("Digita il primo numero");
        int numeroA=inserisci.nextInt();
        System.out.println("Digita il seconda numero");
        int numeroB=inserisci.nextInt();
        Addizione faiLaSomma=new Addizione(numeroA,numeroB);
        int risultato=faiLaSomma.somma();
        System.out.println("il risultato della somma di"+numeroA+" "+numeroB+" e' "+risultato);
    }
}
