public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1234;     //Number to be reversed
        int reverse = 0;    //Variable to store reversed number

        while (num != 0) {
            int digit = num % 10;    //Get last digit using % 10
            reverse = reverse * 10 + digit;  //Append digit to reverse number
            num = num / 10;      //Remove last digit by / 10
        }

        System.out.println("Reversed Number = " + reverse); //Output the reversed number
    }
}
