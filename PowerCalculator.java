import java.util.*;
public class PowerCalculator 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the base=");
        double b= sc.nextDouble();
        System.out.println("enter the exponent=");
        double e= sc.nextDouble();
        double result = Math.pow(e, b);
        System.out.println(b + " raised to the " + e + " is " + result);
    }
    
}
