import java.util.ArrayList;

public class Main {


    public static int n=500;
    public static double k=0.026;
    public static double xMax=12*Math.pow(10,9);
    public static double x0=2.555*Math.pow(10,9);



    public static void main(String[] args) {


       FirstOrderODESolver solverRK3 = new FirstOrderODESolver((new RK3SingleStep()));

       double xEndRK3 = solverRK3.integrate(  (t,x) -> k*(1-x/xMax)*x , 0,x0,50,n);

        System.out.println("solution Rungeg-Kutt3:");
        System.out.println(xEndRK3);


    }

}
