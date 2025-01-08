import java.util.*;
public class CelsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature :");
        int temp = sc.nextInt();
        int fah = (temp*9/5) +32;
        System.out.println("the temperature in fahrenheit is :" + fah);    }
}
