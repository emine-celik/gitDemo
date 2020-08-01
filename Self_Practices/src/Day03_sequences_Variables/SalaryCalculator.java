package Day03_sequences_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 150000;
        double tax =0.28;

        double totalTax =   salary * tax;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);





    }
}
