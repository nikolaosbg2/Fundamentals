import java.text.DecimalFormat;
import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        if(n<0){n=n*-1;}
        String st = String.valueOf(n);


        int result =OddEvenSumsMultiplication(n);

        System.out.println(Math.abs(result));


    }
      private static String Even(String evens){
int evenSum = 0;
          for (int i = 0; i < evens.length(); i++) {
              int nn = Integer.parseInt(evens.charAt(i)+"");
              if ((nn % 10)%2 == 0) {
                  evenSum += nn % 10;
              }
          }
String ev = String.valueOf(evenSum);
return ev;
      }
    private static String Odd(String odds){
        int oddSum = 0;
        for (int i = 0; i < odds.length(); i++) {
            int nn = Integer.parseInt(odds.charAt(i)+"");
            if ((nn % 10)%2 != 0) {
                oddSum += nn % 10;
            }
        }
        String odd = String.valueOf(oddSum);
        return odd;
    }
    private static int OddEvenSumsMultiplication(int n){
        int evenSum = Integer.parseInt(Even(n+""));
        int oddSum = Integer.parseInt(Odd(n+""));
        return Math.abs(evenSum*oddSum);
    }
}
