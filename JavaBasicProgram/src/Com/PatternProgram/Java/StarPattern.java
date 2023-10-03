package Com.PatternProgram.Java;

public class StarPattern {

	public static void main(String[] args) {
		  int rows = 5;

	        // Pattern 1: Right Triangle
	        System.out.println("Pattern 1: Right Triangle");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        System.out.println();
	        
	     // Pattern 2: Inverted Right Triangle
	        System.out.println("Pattern 2: Inverted Right Triangle");
	        for (int i = rows; i >= 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        System.out.println();
	        
	     // Pattern 3: Pyramid
	        System.out.println("Pattern 3: Pyramid");
	        for (int i = 0; i < rows; i++) {
	            for (int j = rows - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        System.out.println();
	        
	        // Pattern 4: Diamond
	        System.out.println("Pattern 4: Diamond");
	        for (int i = 0; i < rows; i++) {
	            for (int j = rows - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        for (int i = rows - 1; i >= 0; i--) {
	            for (int j = rows - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	}

}
	
}
