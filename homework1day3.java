package secondday;

public class homework1day3 {

     public static void main(String[] args) {
         String r= primeNumber(5);
         System.out.println(r);

    }
    public static String primeNumber(int num) {
        if ((num % num == 0) && (num % 1 == 0)) {
            return ("prime number");
        }
        else {
            return ("not prime number");
        }
    }



}
