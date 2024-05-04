public class checkPalindrome
{
	public static void main(String[] args) {
		int num1 = 1221;
		String num2 = Integer.toString(num1); // storing the original numeber
		String temp = "";
		
		while(num1>0){
		    int rem = num1%10; // gets the last digit
		    temp += rem+"";
		    num1=num1/10; // reduce the original number
		}
		
		if(num2.equals(temp)){
		    System.out.print(num2 + " is a palindrome");
		}
		else{
		    System.out.print(num2 +" is not a palindrome");
		}
	}
}
