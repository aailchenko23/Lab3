package Lab3;

import java.util.Scanner;

public class Second {
    public static void  main (String[] args){
     Scanner scan = new Scanner(System.in);
     System.out.print("Введіть тризначне число:");
     int n= scan.nextInt();
     int maxDigit = 0;
     while (n>0){
         int digit = n%10;
         if(digit>maxDigit){
             maxDigit=digit;
         }
        n/= 10;
     }
     System.out.println("Найбільша цифра:"+maxDigit);


    }
}
