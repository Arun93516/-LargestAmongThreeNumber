package elbaT;

public class Primenumber {
        static boolean isPrime(int num)
        {
        	for(int i=2; i<=num/2;i++){
	       if(num % i == 0){
		return false;
	           }
    
        	}
        	 return true;
        }
public static void main(String args[]){
	
	boolean result=isPrime(10);
	if(result == true){
		System.out.println("true");
	}
}
}