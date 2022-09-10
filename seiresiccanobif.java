package elbaT;

public class seiresiccanobif {
 static void getfibonacci(int range)
 {
	 int n1=1;
	 int n2=1;
	 System.out.print(n1+" "+n2+" ");
	 
	 for (int i=1 ; i<=range ; i++ ){
		 int n3=n1+n2;
		 System.out.print(n3+" ");
		 n1=n2;
		 n2=n3;
		 
	 }
 }
 public static void main(String args[]){
	 getfibonacci(100);
	 
 }
}
