package Lab3;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть число:");
        int n;
        n = scan.nextInt();
        if (n > 50 && n < 100) {
            System.out.println("Число  не міститься в проміжку (25; 100),n");
        }else{
            System.out.println("Число міститься в проміжку (25; 100),n");

        }
    }
}
