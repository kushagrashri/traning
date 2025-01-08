import java.util.*;
public class new6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("principal=");
        int p = sc.nextInt();
        System.out.println("rate=");
        int r= sc.nextInt();
        System.out.println("time=");
        int t= sc.nextInt();
        double SI= (p*r*t)/100;
        System.out.println("simple interest=" + SI);
    }
    
}
