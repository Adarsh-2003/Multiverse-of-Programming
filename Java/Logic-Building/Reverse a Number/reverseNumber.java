public class reverseNumber {
	public static void main(String[] args) {
		int num = 234;
		while(num>0) {
			int rem = num % 10;
			// this line gets the remainder of the number
			// in this case is 4
			System.out.print(rem);
			num = num/10;
			// it reduces the number one by one
			// 234/10 = 23 (i.e gets the quotient)
		}
	}
}