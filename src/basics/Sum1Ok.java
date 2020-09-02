package basics;

public class Sum1Ok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Sumas " + sum(1252));
		System.out.println("Factorial " + factorial(5));
		//System.out.println("Máximo " + findMax());
		//System.out.println("Máximo " + findMin());
		//System.out.println("Máximo " + findAvg()); 
	}

	public static int sum(int[] numbers) {
	    int sum=0;
	    for (int i = 0; i < numbers.length; i++) {
	        sum=sum+numbers[i];
	    }
	    return sum;
	}
	
	public static int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    else if (n == 1) {
	        return 1;
	    }
	    return factorial(n-1) * n;
	}
	
	public static int findMax(int[] arr) {
	    int max = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    return max;
	}

	public static int findMin(int[] arr) {
	    int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    return min;
	}

	public static int findAvg(int[] arr) {
	    int sum = 0;
	    for (int i = 0; i < arr.length; i++) {
	        sum = sum + arr[i];
	    }
	    return sum / arr.length;
	}
	
}
