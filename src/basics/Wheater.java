package basics;

public class Wheater {
	public static void main (String[] args) {
		// This program will be suggestions of what to wear based on the weather (temperature and sun conditions)
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It´s pleasant. Wear shorts and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition != "Sunny")) {
			System.out.println("It´s a little cooler. Perhaps wear a long-sleeve shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cool day. Bring a sweater.");
		}
		
		System.out.println("The program is ending.");
	}
}
