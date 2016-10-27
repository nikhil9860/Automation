import java.io.*;

class ParanDemo{
	public static void main(String[] args) throws Exception {
		
		int count=0,count1=0;
		String line;
		

		FileReader fr = new FileReader("Prime.java");
		BufferedReader br = new BufferedReader(fr);

		
		while ((line=br.readLine())!=null ) {
			
			for(int i=0;i<line.length();i++){

			if(line.charAt(i)=='{'){

				count ++;

			}

			else if(line.charAt(i)=='}'){

				count1 ++;

			}



				
			}



		}

			System.out.println(" { are :"+count);
			System.out.println(" } are :"+count1);

			if(count==count1){

				System.out.println("Pran are Blanced");
			}

			else {
				System.out.println("Pran not Blanced");
			}


	}
}