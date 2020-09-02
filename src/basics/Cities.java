package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define array
		String [] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare & define the array (only size)
		String[] states = new String[5];
		states [0] = "California";
		states [1] = "Ohio";
		states [2] = "New Jersey";
		states [3] = "Texas";
		states [4] = "Utah";
		
		System.out.println(states[0]);
		
		// Declare array
		String [] countries;
		
		// Define array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		
		System.out.println(countries[1]);
		
		// Do Loop: enters the loop THEN tests condition
		System.out.println("Do Loop");
		int i = 0;
		do {
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		} while (i < 5);
		
		// While loop: tests condition first than enters loop
		System.out.println("While Loop");
		int n = 0;
		while (n <= 4) {
			String state = states [n];
			System.out.println(state);
			n++;
		}
		
		// While loop: tests condition first than enters loop with boolean 
		System.out.println("While Loop Boolean");
		int na = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state1 = states [na];
			System.out.println(state1);
			if (state1 == "Texas") {
				System.out.println("STATE FOUND:" + state1);
				stateFound = true;
			}
			na++;
		}
		
		// For loop: best structure for iterating through an array
		System.out.println("For Loop");
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}

}
 