class FindPrime {
  public static void main(String args[]) {

    int num = 15;
    boolean isPrime;

    if(num < 2) isPrime = false;
    else isPrime = true;
    // if number is divisible by any num between 2 to n/2, it's a non-prime
    for(int i = 2; i <= num/2; i++) {
      if((num % i) == 0) {
        isPrime = false;
        break;
      }
    }

    if(isPrime) System.out.println("Prime");
    else System.out.println("Not Prime");
  }
}
