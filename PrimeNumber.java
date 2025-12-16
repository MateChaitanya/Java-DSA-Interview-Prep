public class PrimeNumber {
    public static void main(String[] args) {

        int num = 7;      //Number to be checked
        boolean isPrime = true;        //Flag to track if number is prime
 
        if (num <= 1) {                //Numbers less than or equal to 1 are not prime
            isPrime = false;           //Set flag to false
        }

        for (int i = 2; i <= num / 2; i++) {           //Check divisibility from 2 to num/2
            if (num % i == 0) {                              //If divisible, it's not prime
                isPrime = false;                          //Set flag to false
                break;                      //Exit loop early
            }
        }

        if (isPrime) {                     //Output result based on flag
            System.out.println("Prime Number");          //If flag is true, it's prime
        } else {
            System.out.println("Not a Prime Number");     //If flag is false, it's not prime
        }
    }
}
