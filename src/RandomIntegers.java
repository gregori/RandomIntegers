import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		SecureRandom numerosAleatorios = new SecureRandom();
		
		lanca6milhoes(numerosAleatorios);

	}
	
	public static void lanca20(SecureRandom numerosAleatorios) {
		for (int counter = 1; counter <= 20; counter++) {
			// número aleatório entre 1 e 6
			int face = 1 + numerosAleatorios.nextInt(6);
			
			System.out.printf("%d ", face); // exibe o valor gerado
			
			// pula linha se contador divisível por 5
			if (counter % 5 == 0) 
				System.out.println();
		}
	}
	
	public static void lanca6milhoes(SecureRandom numerosAleatorios) {
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		int f5 = 0;
		int f6 = 0;
		
		for (int counter = 1; counter <= 6000000; counter++) {
			// número aleatório entre 1 e 6
			int face = 1 + numerosAleatorios.nextInt(6);
			
			switch (face) {
			case 1:
				++f1;
				break;
			case 2:
				++f2;
				break;
			case 3:
				++f3;
				break;
			case 4:
				++f4;
				break;
			case 5:
				++f5;
				break;
			case 6:
				++f6;
				break;
			}
		}
		
		System.out.println("Face\tFrequência");
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", 
				f1, f2, f3, f4, f5, f6);
	}

}
