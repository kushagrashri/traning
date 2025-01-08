import java.util.*;
public class average 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number =");
        double num1= sc.nextDouble();
        System.out.println("enter the second number =");
        double num2= sc.nextDouble();
        System.out.println("enter the third number =");
        double num3= sc.nextDouble();
        double avg= (num1+num2+num3)/3;
        System.out.println("the average of the three number = "+ avg);
    
    }
    
}
