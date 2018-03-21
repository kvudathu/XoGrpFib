
public class RecFib {
	
  public static long fibonacci(long number) {
    if ((number == 0) || (number == 1)) // base cases
      return number;
    else
      return fibonacci(number - 1) + fibonacci(number - 2);
  }

  public static void main(String[] args) {
    for (int counter = 0; counter <= 1000000; counter++)
      System.out.println( fibonacci(counter) + "\n");
  }
}