package day01_Variables;

import java.util.Scanner;

public class CarInsurance78 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        String driverLincese="";
        long zipCode=0;
        int age=0;
        int experience=0;



        System.out.println("Welcome to the CountyFarm car insurance!");
        System.out.println("Enter your name");
        name=scan.next();

        System.out.println("Do you have a US driver license?");
        driverLincese=scan.next();

        if(driverLincese.equalsIgnoreCase("yes")){

        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        zipCode=scan.nextLong();
        if(zipCode==20910||zipCode==20740){
            premium+=60;
        }
        if(zipCode==22102 || zipCode == 22103){
            premium+=30;
        }else{
            premium+=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.next();
        if(vehicleOwnership.equalsIgnoreCase("owned")){
            premium+=10;
        }else{
            premium+=20;
        }
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;
        }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
            premium+=10;
        }else if(vehicleUsage.equalsIgnoreCase("commute")){
            premium+=20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            premium+=daysDrivenToWorkOrSchool*5;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium += milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        age=scan.nextInt();

        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        if(age <18){
            premium*=20;
        }else if(age <=21){
            premium*=6;
        }else if(age<=25){
            premium*=2;
        }
        System.out.println("How many years you've been driving?");
        experience= scan.nextInt();
        if(experience>0 && age - experience>16){
            premium-=experience*5;
        }else{
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Have you had any accidents in the last 5 years?");

        String accident=scan.next();
        if(accident.equalsIgnoreCase("Yes")){
            System.out.println("How many?");
            accidentsAmount=scan.nextInt();
            premium+=accidentsAmount*(premium*0.2);
        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.next();

       if(continuousInsurance.equalsIgnoreCase("no")){premium*=2;}

        System.out.println("What is the highest level of education you have completed?");

        education=scan.next();
        if(education.equalsIgnoreCase("PHD") || education.equalsIgnoreCase("Baachelors") || education.equalsIgnoreCase( "Master")){
           premium -=0.05*premium;
       }else if(education.equalsIgnoreCase("Doctors")){
            premium-=0.10*premium;
        }else if(education.equalsIgnoreCase("Less than High School")){
            premium -=0.05*premium;
        }
        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);

        System.out.println("Reference number: "+referenceNumber+name.substring(0,2).toUpperCase()+age+name.substring(name.length()-2).toUpperCase()+zipCode+education.toUpperCase());


















    }
}
