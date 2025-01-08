import java.util.*;
public class new5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("radius=");
        double rad = sc.nextDouble();
        System.out.println("height=");
        double hei=sc.nextDouble();
        double volume = Math.PI*rad*rad*hei;
        System.out.println("the volume="+volume);
    }
    
}
