package Day05_ArithmeticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {
        String firstName=("Emine");
        String lastName =("Celik");
        char gender=('F');
        String companyName=("PayPal");
        String jobTitle="SDET";
        boolean isFullTime= true;
        boolean isMarried=false;
        int age = 40;
        double salary = 1200000.50;

        String fullName= firstName+" "+lastName;

        System.out.println("Eployee's full name is: "+fullName+"\n"+fullName+"'s gender is: "+gender);
        System.out.println(fullName+"'s age is: "+age+"\n"+fullName+"'s works at: "+companyName+"\n"+fullName+"'s Job title is: "+jobTitle);
        System.out.println(fullName+"'s Salary is: "+salary+"\n"+fullName+"'s is married: "+isMarried);






    }
}
