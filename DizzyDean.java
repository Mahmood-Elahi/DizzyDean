package DizzyDean;

import java.util.Scanner;
import java.util.Random;

public class DizzyDean {

	public static void main(String[] args) {
//		// Part 1
//		Random rand = new Random(); //Allows random number to be created for loop
//		int dizzyDeanSteps = 1; //Sets initial value of DizzyDean
//		int random; //Initlizes random variable for use in determining if DizzyDean goes forwards or backwards
//		do {
//			random = rand.nextInt(0, 100); //Sets paremeters for random number
//			if (random >= 50 || dizzyDeanSteps == 1) { //Moves DizzyDean forward at the start 
//				dizzyDeanSteps++;//Moves DizzyDean forward
//			} else if (random < 50) { //Moves DizzyDean backwards if random number is less that 50
//				dizzyDeanSteps--; //Moves DizzyDean backwards
//			}
//			System.out.print(dizzyDeanSteps); //Outputs DizzyDeans steps as he moves
//
//		} while (dizzyDeanSteps <= 9); //Sets condition for loop to stop once DizzyDean reaches end of 10 step bridge

// Part 2		
//		Scanner keyb = new Scanner(System.in); //Opens scanner to collect user's request for how big the bridge should be
//		int userSteps;
//		Random rand = new Random(); //Allows random number to be created for loop
//		int dizzyDeanSteps = 1; //Sets initial value of DizzyDean
//		int random; //Initlizes random variable for use in determining if DizzyDean goes forwards or backwards
//		System.out.println("How many steps do you want the bridge to have?");
//		userSteps = keyb.nextInt();//Collects user's request for how big the bridge should be
//	do {
//			random = rand.nextInt(0, 100); //Sets paremeters for random number
//			if (random >= 50 || dizzyDeanSteps == 1) {  //Moves DizzyDean forward at the start 
//				dizzyDeanSteps++; //Moves DizzyDean forwar
//			} else if (random < 50) { //Moves DizzyDean backwards if random number is less that 50
//				dizzyDeanSteps--; //Moves DizzyDean backwards
//			}
//		System.out.print(dizzyDeanSteps); //Outputs DizzyDeans steps as he moves
//
//		} while (dizzyDeanSteps <= userSteps - 1); //Sets condition for loop to stop once DizzyDean reaches end of users inputed step bridge

// Part 3
		Scanner keyb = new Scanner(System.in); //Opens scanner to collect user's request for how big the bridge should be
		int userSteps = 0; //Collects user's request for how big the bridge should be
		int dizzyDeanTotal = 0; //Initalizes DizzyDeans total steps
		System.out.println("How many steps do you want the bridge to have?");
		userSteps = Integer.parseInt(keyb.nextLine()); //Collects user's request for how big the bridge should be
		for (int total = 0; total < 100001; total++) { //Sets conditions for loop to keep repeating until total reaches 1000001
			int dizzyDeanSteps = 1; //Sets initial value of DizzyDean

			do {
				Random rand = new Random(); //Allows random number to be created for loop
				int random = rand.nextInt(0, 100);
				if (random >= 50 || dizzyDeanSteps == 1) {  //Moves DizzyDean forward at the start 
					dizzyDeanSteps++;
					dizzyDeanTotal++; //Adds 1 to DizzyDean total steps every time he moves forward
				} else if (random < 50) {
					dizzyDeanSteps--;
					dizzyDeanTotal++; // Adds 1 to DizzyDean total steps every time he moves backwards

				}

			} while (dizzyDeanSteps <= userSteps);

		}

		System.out.println(dizzyDeanTotal / 100000); //Displays average number of steps by dividing total steps by times the loop ran

	}

}
