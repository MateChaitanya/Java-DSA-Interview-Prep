public class PalindromeNumber {
    public static void main(String[] args) {

        int num = 121;            //Number to be checked
        int original = num;       //Store original number
        int reverse = 0;          //Variable to store reversed number

        while (num != 0) {            //Reverse the number
            reverse = reverse * 10 + num % 10;           //Get last digit and append to reverse
            num = num / 10;                          //Remove last digit from num
        }

        if (original == reverse) {                      //Check if original and reversed are the same
            System.out.println("Palindrome Number");
        } else {                                     //If not the same
            System.out.println("Not a Palindrome");
        }
    }
}
