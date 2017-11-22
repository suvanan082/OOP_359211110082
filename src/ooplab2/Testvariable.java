package ooplab2;

import java.util.Scanner;

public class Testvariable {
    public static void main(String[] args) {
//  integer
        int i = ;
        i = 10;
        System.out.println("i=" + i);
        int j = 20;
        System.out.println("i+j=" + (i + j));
        System.out.println("i*j=" + (i * j));
        System.out.println("i/j=" + (i / j));

        //Double
        double v = 50.5;
        System.out.println("v=" + v);

        i = (int) v;
        System.out.println(i);
        System.out.println(v);

        //Charector
        char c = 'x';
        System.out.println(c);

        //string
        String s = "Hollo,wold";
        System.out.println(s);
        String name ="I'PEAR";
        System.out.println(s+" "+name);
        String msg = s.concat(" "+name);
        System.out.println(msg);
        System.out.println(msg.toUpperCase());
        int age = reader.resdLine();
        System.out.println("You are"+age+"years old");

        //scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("where are you from?:");
        String address = scanner.nextLine();
        System.out.println("you came From"+address);
        System.out.print("What is your weight?:");
        double weight = scanner.nextDouble();
        System.out.println("Your weight: "+weight);




    }//main

}//calss





