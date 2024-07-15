import java.util.Scanner;

public class PloshadFiguri {
    public static void main (String[] args){
        double a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("a= "); a=in.nextDouble();
        System.out.println(("b= ")); b= in.nextDouble();
        double p = 2 * (a+b);
        System.out.println(p);
        in.close();
    }
}
