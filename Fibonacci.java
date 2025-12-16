public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;    //Number of terms in Fibonacci series
        int a = 0, b = 1;     //First two terms

        System.out.print(a + " " + b + " ");   //Print first two terms

        for (int i = 2; i < n; i++) {            //Loop to generate remaining terms
            int c = a + b;   //Next term is sum of previous two terms
            System.out.print(c + " ");     //Print next term
            a = b;                //Update a and b for next iteration
            b = c;               //Update a and b for next iteration
        } 
    }
}
