import java.util.Scanner;

class StringOp  {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = sc.nextLine();

		 for (String a : s.split(" ") ) {


		StringBuffer sb = new StringBuffer(a);
		
		System.out.print(" "+sb.reverse());
		

		 }

			

	}
}