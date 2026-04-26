package bsit2_2n;
      import java.util.Scanner;
      public class Bsit22n_Albao_Christine_ScholarshipQualificationSystem {
      public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double s_score;
		String s_res = "";
		char type;
		String sc = "";
		  System.out.println("Scholarship Qualification System");
		
		  System.out.println("Input your name: ");
		  String name = input.nextLine();
		  
		  System.out.println("Input your GWA: ");
		  double gwa = input.nextDouble();
		  
		  System.out.println("Input your entrance exam score: ");
		  int e_score = input.nextInt();		  
		  
		  System.out.println("Input your entrance interview score: ");
		  int i_score = input.nextInt();
		  input.nextLine();
		  System.out.println("Input your Document Verification: ");
		  String d_ver = input.nextLine();
		  
		  		s_score = (e_score * 0.50) + (i_score * 0.50);
		  
		 if (d_ver.equals("Verified")) {
			  if (s_score >= 90) {
				  s_res="full Scholarship";
			  }else if (s_score >= 80){
				   s_res="Partial Scholarship";
			  }else if (s_score >= 70){
				   s_res="Book Allowance";
			  }else {
				  s_res="Not Qualified";
		      }
	    }else if (d_ver.equals("Not Verified")) {
		    s_res = "Not Qualified";
			  }
		
		  

			if (gwa >= 1.00 && gwa <= 1.50) {
				type = 'a'; 
			} else if (gwa >= 1.51 && gwa <= 2.00) {
				type = 'b'; 
			} 	else if (gwa >= 2.01 && gwa <= 2.50) {
				type = 'c';
			} else {
				type = 'd';
			}
		switch(type) {  
		case 'a':
			sc= "Academic Excellence";
		  break;
		case 'b':
			sc= "Merit Scholarship";
		  break;
		case 'c':
			sc= "Financial Assistance";
		  break;
		case 'd':
			sc= "No Scholarship";
		  break;
		default:
			sc= "Invalid Choice!";  
	}
		
		System.out.println("\nStudent Name: "+name);
		System.out.println("Scholarship Score: "+s_score);
		System.out.println("Scholarship Result: "+s_res);
		System.out.println("Scholarship Category: "+sc);
 input.close(); } 
 }
