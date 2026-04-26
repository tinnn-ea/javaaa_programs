package bsit2_2n;
	import java.util.Scanner;
	
	public class StudentAgeAnalyzerAlbao {
	public static String ageCat(int age) {
		 if (age >= 0 && age <= 12) {
	            return "Child";
	        } else if (age >= 13 && age <= 19) {
	            return "Teenager";
	        } else if (age >= 20 && age <= 59 ) {
	            return "Adult";
	        }   else if (age > 60) {
	        	return "Senior Citizen";
	        } else {
	            return "Invalid Input";
	        }
	}
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Enter your name: ");
		String sname = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		String category = ageCat(age);
		System.out.println("Your Age Category is: " +category);
	
		
		input.close();
	}
	  
}
