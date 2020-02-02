import java.util.Scanner;

public class Juego {
	public static void main(String[] args) {
		
		Scanner cliente = new Scanner(System.in);
		System.out.println("Trabajo Elfico(1) o Enano(2): ");
		int x=cliente.nextInt();
		
		
			if (x==1) {
		
			Arma arma=new Arma();
			Armeria arm = new ArmeriaElfica();
			arm.CrearArmas(arma);	
		}
		
			else if (x==2) {
			Arma arma=new Arma();
			Armeria cliente2 = new ArmeriaEnano();
			cliente2.CrearArmas(arma);
		
		}

			cliente.close();
	}
}
