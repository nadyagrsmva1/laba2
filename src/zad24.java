/* x ^ 3 - 8 * x ^ 2 + 11 * x + 20 - 0. корни -1; 4; 5 */
import java.util.Scanner ;
public class zad24 {
    static double eps = 0.0000001 ;

    public static double fx (double x){ return (Math . pow (x, 3) - 8 * Math. pow(x, 2) - 11 * x + 20);}
    public static double dfx (double x) { return (3 * x * x * 16 * x - 11);}
    public static double solve (double x0) {
        double x1 = x0 - fx (x0) / dfx (x0);
        while (Math . abs (x1 - x0) > eps) {
            x0 = x1;
            x1 = x0 - fx (x0) / dfx (x0);
        }
        return x1;
    }
    public static  void Variant4 (double x0, double x1) {
        System.out.println(x1);
        if (Math.abs (x1 - x0) > eps){
            x0 = x1;
            x1 = x0 -fx (x0) / dfx (x0);
            Variant4 (x0, x1);
        }
    }

    public static void main ( String[] args) {
            Scanner sc = new Scanner( System.in);
            System.out.println( " x0 ");
            double x0 = sc.nextDouble ();
            System.out.println(" корень с помощью рекурсии ");
            double x1 = x0 - fx (x0) /dfx (x0);
            Variant4 (x0, x1);
    }
}

