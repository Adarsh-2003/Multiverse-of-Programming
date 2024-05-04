public class fibonacci
// 0 1 1 2 3 5 8 .....
{
	public static void main(String[] args) {
		int num1=0; int num2=1; int num3;
		System.out.print(num1 + ","+ num2);
		for(int i=1; i<=10; i++){
		    num3= num1 + num2;
		    num1 = num2;
		    num2 = num3;
		    System.out.print(","+ num3); // concats
		}
	}
}

