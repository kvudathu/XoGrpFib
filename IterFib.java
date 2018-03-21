
public class IterFib {
	public static long fibonacciIterative(long n) {
		if(n <= 1) {
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		
		for(int i=2; i<n; i++) {
			int temp = fib;
			fib+= prevFib;
			prevFib = temp;
		}
		return fib;
	}
	public static void main(String[] args) {
	    for (long counter = 0; counter <= 1000000; counter++)
	    	 System.out.println(fibonacciIterative(counter) + "\n");
	  }
}
