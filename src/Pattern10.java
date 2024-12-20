
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        for (int i = 1; i <= 5; i++) {  // Loop through each row
		            for (int j = 1; j <= 5; j++) {  // Loop through each column
		                if (i == 1 || i == 5) {  // First and last rows
		                    if (j != 5) {
		                        System.out.print("* ");  // Print star followed by a space (except at the last column)
		                    } else {
		                        System.out.print("*");  // For the last column, just print the star without space
		                    }
		                } else if (j == 1 || j == 5) {  // For the first and last columns in the middle rows
		                    System.out.print("*");  // Print star (no space)
		                } else {
		                    System.out.print(" ");  // Print space for the middle columns
		                }
		            }
		            System.out.println();  // Move to the next line after each row
		        }
		    }
	}
