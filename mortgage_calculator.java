import java.text.NumberFormat;
import java.util.Scanner;

public class main{
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12 ;
        final byte PERCENT=100;
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest =scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;


        System.out.println("Period (Years): ");
        byte years =scanner.nextByte();
        float numberOfPayments = years * monthlyInterest;

        double mortage = principal 
        * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))
        / (Math.pow(1+ monthlyInterest , numberOfPayments) - 1);   


        String mortageFormatted = NumberFormat.getCurrencyInstance().format(mortage);

        System.out.println("Mortage: " + mortageFormatted);                      



    }
}
