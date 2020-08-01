package day01_Variables;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Laptop56 {
    public static void main(String[] args) {
        int memorySize = 0;
        String screenResolution;
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;
        double screenSize=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        screenSize= scan.nextDouble();
        if (screenSize==13.3) {
            price += 200;
        } else if (screenSize==15.0) {
            price += 300;
        } else if (screenSize==17.3) {
            price += 400;
        }
        System.out.println("Select CPU type:");
        cpu = scan.next();
        if (cpu.equals("i3")) {
            price += 150;
        } else if (cpu.equals("i5")) {
            price += 250;
        } else if (cpu.equals("i7")) {
            price += 350;
        }
        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        for (int i = 4; i <= ram; i += 4) {
            price += 50;
        }
        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();


        if (storageType.equals("SSD")) {
            for (int i = 500; i <= memorySize; i += 500) {
                price += 100;
            }
        } else if ((storageType.equals("HDD"))) {

            for (int i = 500; i <= memorySize; i += 500) {
                price += 50;
            }
        }

        System.out.println("Enter screen resolution:");
        screenResolution = scan.next();
        if (screenResolution.equals("FULLHD")) {
            price += 100;

        } else if (screenResolution.equals("4K")) {
            price += 200;
        }
        System.out.println("Laptop price is: $"+price);

    }

}