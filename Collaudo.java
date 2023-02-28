import java.util.Scanner;
public class Collaudo {
	
	public static void main (String [] Args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Inserire il grado del polinomio: ");
		int grado = s1.nextInt();
		
		System.out.println(" ");
		
		Polinomio s2 = new Polinomio(grado);
		
		for (int i = 0; i < grado; i ++) {
			
			System.out.print("Inserire la posizione del coefficente numero " + i + ": ");
			int pos = s1.nextInt();
			
			System.out.print("Inserire il coefficente: ");
			double coefficente = s1.nextDouble();
			
			s2.setCostante(pos, coefficente);
			
			System.out.println(" ");

		}
		
		System.out.println(" ");
		
		System.out.println("Inserisci la x del polinomio: ");
		int x = s1.nextInt();
		
		double risultato = s2.valuta(x);
		
		System.out.println(" ");
		
		System.out.println("Il risultato dell'operazione di somma è: " + risultato);
	}
}
