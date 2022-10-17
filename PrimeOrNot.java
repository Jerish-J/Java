public class PrimeOrNot {

    public static void main(String[] args) {
        
        int num = 7;
        for (int i = 2; i < num;) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                break;
            }
            else {
                System.out.println(num + " is a prime number");
                break;
            }
        }
    }
}