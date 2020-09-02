package basics;

public class Sum1ton {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n
		System.out.println("Suma de números *******");
		int t = 5;
		sumar(t);

		// Write a function that computes the factorial value
		System.out.println("Factorial de números **********");
		int f = 5;
		factorial(f);
		
		// Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array.
		// Hint: this should be static functions with a return type of the same data type as the array declaration.
		System.out.println("Mínimo valor " + min());
		System.out.println("Media " + med(4));
		System.out.println("Máximo " + max());
	}

	static void sumar(int n) {
		int na = 0;
		int total = 0;
		while (na <= n) {
			total = total + na;
			na++;
			}
		System.out.println("Suma número " + n + " es igual a " + total);
	}
	
	static void factorial(int m) {
		int nb = m;
		int total1 = m;
		while (nb > 1) {
				total1 = total1 * (nb - 1);
				nb = nb - 1;
			}	
		System.out.println("Factorial de " + m + " es igual a " + total1);		
	}
	
	static int min () {
		int[] valmin;
		valmin = new int[5];
		valmin[0] = 30;
		valmin[1] = 15;
		valmin[2] = 20;
		valmin[3] = 22;
		valmin[4] = 26;
		
		int minimo = valmin[0];
		for (int x = 0; x < 5; x++) {
			if (valmin[x] < minimo) {
				minimo = valmin[x];
			}
		}
		return minimo;
	}
	
	static double med(int numA) {
		int[] valmin;
		valmin = new int[5];
		valmin[0] = 30;
		valmin[1] = 15;
		valmin[2] = 20;
		valmin[3] = 22;
		valmin[4] = 26;
		
		int total = 0;
		double media = 0;
		
		for (int x = 0; x < numA; x++) {
			total = total + valmin[x];
		}
		media = total / numA;
		return media;
	}
	
	static int max() {
		int[] valmin;
		valmin = new int[5];
		valmin[0] = 30;
		valmin[1] = 15;
		valmin[2] = 20;
		valmin[3] = 22;
		valmin[4] = 26;
		
		int maximo = valmin[0];
		for (int x = 0; x < 5; x++) {
			if (valmin[x] > maximo) {
				maximo = valmin[x];
			}
		}
		return maximo;
		
	}
}
