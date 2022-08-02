package secondday;

public class homework2day3 {
    public static void main(String[]args){
        int t=calculateTax(110);
        System.out.println(t);
    }
    public static int calculateTax(int price){

       int tax = price * 15/100;
       return tax;
        }



    }
