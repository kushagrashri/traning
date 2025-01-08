import java.util.*;
public class perimeterofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length=");
        double l= sc.nextInt();
        System.out.println("width=");
        double w= sc.nextInt();
        double perimeter = 2*(l+w);
        System.out.println("perimeter of the rectangle="+perimeter);
    }

    
}
