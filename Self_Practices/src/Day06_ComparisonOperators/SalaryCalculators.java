package Day06_ComparisonOperators;

public class SalaryCalculators {
    public static void main(String[] args) {

        double rate = 60;
        double stateTaxRate = 0.05;
        double federalTaxRate = 0.18;
        int weeklyHours = 40;

        double salary = rate * weeklyHours * 48;
        double totalTax = salary * stateTaxRate + federalTaxRate;
        double salaryafterTax =salary-totalTax;


        System.out.println("Your salary is: "+salary+" USD"+"\n"+"Your total tax is: "+totalTax+" USD"+"\n"+"Your income after tax is: "+salaryafterTax+" USD");



    }
}
