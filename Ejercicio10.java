import java.util.*;

public class Ejercicio10 {

	public static void main(String[] args) {
		double multiplos, multip, n, n1, sumatoria, sumatoria2;
		Scanner scanner = new Scanner (System.in);
		
		sumatoria = 0;
		multiplos = 0;
		sumatoria2 = 0;
		while (sumatoria<=1000) {
			System.out.println("Ingrese el primer n�mero");
			n = scanner.nextDouble();
			System.out.println("Ingrese el segundo n�mero");
			n1 = scanner.nextDouble();
			sumatoria2 = n + n1;
			System.out.println(+sumatoria);
			if ((n % 6==0)) {
				multiplos = multiplos++;
			} else {
				if ((n1 % 6==0)) {
					multiplos = multiplos++;
				} else {
					System.out.println("El n�mero NO es un m�ltiplo de 6");
				}
				if (n>=1 && n<=10) {
					sumatoria2 += n;
				} else {
					if (n1>=1 && n1<=10) {
						sumatoria2 += n1;
					} else {
						System.out.println("No hay n�meros entre 1 y 10");
					}
				}
			}
		}
		System.out.println("Cantidad de n�meros multiplos de 6: "+multiplos);
		System.out.println("Sumatoria de n�meros en el rango: l al 10: "+sumatoria2);
	}


}

