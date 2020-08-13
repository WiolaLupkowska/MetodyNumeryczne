import java.util.Arrays;


public class Zad4 {

    public static double funkcja (double x){
        double f_x= -0.1*Math.pow(x,4)-0.15*Math.pow(x,3)-0.5*Math.pow(x,2)-0.25*x;
        return f_x;
    }

    public static double pochodna (double x){
        double pochodna_f_x= -0.1*4*Math.pow(x,3)-0.15*3*Math.pow(x,2)-0.5*2*x-0.25;
        return pochodna_f_x;
    }

    public static double aproksymacja (double x, double h){
        double aproksymacja= (funkcja(x+h)-funkcja(x-h))/(2*h);
        return aproksymacja;
    }

    public static void main(String[] args) {

        //1)
        double wartoscPrawdziwa= pochodna(0.5);
        double apr1=aproksymacja(0.5,0.25);
        System.out.println(apr1+"   aproksymacja h=0,25");
        double apr2=aproksymacja(0.5,0.5);
        System.out.println(apr2+"   aproksymacja h=0,5");

        double et1= (apr1-wartoscPrawdziwa)/wartoscPrawdziwa*100;
        double et2= (apr2-wartoscPrawdziwa)/wartoscPrawdziwa*100;
        System.out.println("wartosć prawdziwa pochodnej:");
        System.out.println(wartoscPrawdziwa);
        System.out.println("Et [%] dla x=0.5 i h= 0.25");
        System.out.println(et1);
        System.out.println("Et [%]  dla x=0.5 i h= 0.25");
        System.out.println(et2);


        //2
        System.out.println(wartoscPrawdziwa + "wartosc prawdziwa pochodnej funkcji");
        double[] tabEt=new double[17];
        double[] h=new double[17];
            for (int k=0;k<17; k++){
                double apr=aproksymacja(0.5,1/(Math.pow(10,k)));
                h[k]=(double)(1/1/(Math.pow(10,k)));
                tabEt[k]=Math.abs((apr-wartoscPrawdziwa)/apr*100);

            }

        System.out.println("tabEt");
        System.out.println(Arrays.toString(tabEt));
        System.out.println("h");
        System.out.println(Arrays.toString(h));
    }



}
