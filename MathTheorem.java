
public class MathTheorem {
	public static void main(String[] args) {
		int counter = 3;
		int iterations;
		int movingNumber;
		while (counter < 1000) {
			iterations = 0;
			movingNumber = counter;
			while (movingNumber >= counter) {
				if (movingNumber % 2 == 1) {
					movingNumber = movingNumber * 3 + 1;
				}else {
					movingNumber /= 2;
				}
				iterations += 1;
			}
		if (iterations == 11 || iterations == 13) {	
				System.out.println("[" + counter + ", " + iterations + ", " + movingNumber + ", " + (counter - movingNumber) + "]");
		}
				counter += 4;
		}
	}
}
