package loop;

public class Task5 {
	public static void main(String args[]) {
		
		int numbersA[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int numbersB[]  = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		/*	・numA * numB の桁数で場合分け
		 * 	・numB = 9の場合に改行を入れる
		 */
		
		for(int numA : numbersA) {
			for(int numB : numbersB) {
				if(numA * numB < 10 && numB == 9) {
					System.out.println("  " + numA * numB);
				}else if(numA * numB < 10 && numB < 9){
					System.out.print("  " + numA * numB);
				}else if(numA * numB > 10 && numB == 9){
					System.out.println(" " + numA * numB);
				}else {
					System.out.print(" " + numA * numB);
				}
				
			}
			
		}
		
	}

}
