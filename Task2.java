package SeleniumCodes;

public class Task2 {

	public static void main (String[]args) 
	{

		//Create 5 rows and 2coloumn ,Print all the values
		
		String[][] arrObj = new String[5][2];

		arrObj[0][0] = "raagul@gmail.com";
		arrObj[0][1] = "Raagul123";
		

		arrObj[1][0] = "mohan@gmail.com";
		arrObj[1][1] = "Mohan123";
		

		arrObj[2][0] = "shyam@gmail.com";
		arrObj[2][1] = "Shyam123";
		

		arrObj[3][0] = "sandy@gmail.com";
		arrObj[3][1] = "Sandy123";
		

		arrObj[4][0] = "rithish@gmail.com";
		arrObj[4][1] = "Rithish123";
		
		

		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 2; j++) {

				System.out.print(arrObj[i][j]+"  ");
			}			
			
			System.out.println(); 
		}
	}
}
