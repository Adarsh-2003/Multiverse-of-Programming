public class primeNumber
{
	public static void main(String[] args) {
		int num=15;
		 boolean isPrime = true;
		if(num>2){
		    for(int i=2; i<num; i++ ){
		        if(num%i == 0){ // 15%(1,2,3... num) i.e checks if divisible or not
					// enters the loop if divisible
                    isPrime = false;
					// sets the bool to false
                    break;
		        }
		    }
		    if(isPrime){ // if isPrime value remains true (i.e did not enter the previous loop) 
				// indicating that it wasnt divisible to other number 
		        System.out.print("prime number");
		    }
		    else{
		        System.out.print("not prime");
		    }
		}
	}
}
