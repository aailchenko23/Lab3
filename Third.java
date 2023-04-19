package Lab3;

public class Third {
  public static void main(String[] args) {
        String direction = "До низу";
        int floor = 8;
        if (direction.equals ("До верху")){
            if (floor == 2 || floor == 3) System.out.println("Ви піднялись на 3 поверх");
            else if (floor <= 9 && floor > 0) ;
            else System.out.println("Ви вказали не існуючий поверх!");
        }
        if (direction.equals ("До низу")){
            if (floor == 2 || floor == 1) System.out.println("Ви спустились на 1 поверх");
            else if (floor <= 9 && floor > 0) System.out.println("Ви спустились на а поверх");
            else System.out.println("Ви вказали не існуючий поверх ");
        }
    }

}


















