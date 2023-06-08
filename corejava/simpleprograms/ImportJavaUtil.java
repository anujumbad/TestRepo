package corejava.simpleprograms;

import java.util.Scanner;

public class ImportJavaUtil {
    public static void main(String[] args) {


        int number;
        String name;
        Scanner sc = new Scanner(System.in);
        {
            //object declareation
            System.out.println("plese enter the number");
            {

                number = sc.nextInt();
                System.out.println("The entered Number" + number);
                System.out.println("plese enter your name");
                name = sc.next();
                System.out.println("Your name is " + name);
            }
        }
    }





}
