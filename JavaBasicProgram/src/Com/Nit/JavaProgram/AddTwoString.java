package Com.Nit.JavaProgram;

public class AddTwoString {

	public static void main(String[] args) {
		
		
		String str1 = "Sonu";
        String str2 = "Roy";
        
        String str3 = "archana";
        String str4 = "Roy";

        // Using the + operator
        String result1 = str1 + " " + str2;
        System.out.println("Result using + operator: " + result1);

        String result3 = str3 + " " + str4;
        System.out.println("Result using + operator: " + result3);
        
        // Using the concat() method
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Result using concat() method: " + result2);
    }

	}


