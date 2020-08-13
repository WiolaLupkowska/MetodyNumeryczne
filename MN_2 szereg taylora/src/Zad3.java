
import java.util.Arrays;

public class Zad3 {

    public static void main(String[] args) {
        int [] m={1,2,3,4};
        double [] h={0.015625,0.0625,0.125,0.25,0.5};
        double [] log_h=new double[h.length];
        for (int i=0;i<h.length;i++){
            log_h[i]=Math.log(h[i]);
        }

        int x=1;
        double [][] aproksymacja_Irz=new double[m.length][h.length];
        double []reszta_m1=new double[h.length];
        double []reszta_m2=new double[h.length];
        double []reszta_m3=new double[h.length];
        double []reszta_m4=new double[h.length];

        for(int i=0; i<m.length;i++) {
            double funkcja_x = x ^ m[i];
            for(int j=0;j<h.length;j++) {
                aproksymacja_Irz[i][j] = funkcja_x + m[i] * (Math.pow(x,(m[i] - 1)) * h[j]); //tu mam policzone wartosci aproksymacji dla m od 1,2,3,4 i kazdego j
                switch (m[i]) {
                    case 1:
                        reszta_m1[j] = 0;
                    case 2:
                        reszta_m2[j] = (2 / (2 * 1)) * (Math.pow(h[j],2));
                    case 3:
                        reszta_m3[j] = 6*x/2*Math.pow(h[j],2)+6/(3*2)*Math.pow(h[j],3);
                    case 4:
                        reszta_m4[j]= 12*Math.pow(x,2)/2*Math.pow(h[j],2)+24*x/6*Math.pow(h[j],3)+24/24*Math.pow(h[j],4);
                }
            }
        }
        System.out.println(Arrays.toString(reszta_m1)+"  R1");
        System.out.println(Arrays.toString(reszta_m2)+"  R2");
        System.out.println(Arrays.toString(reszta_m3)+"  R3");
        System.out.println(Arrays.toString(reszta_m4)+"  R4");
        System.out.println("log(h):");
        System.out.println(Arrays.toString(log_h));
        System.out.println("aproksymacja:");
        for(int i=0; i<aproksymacja_Irz.length;i++)
            System.out.println(Arrays.toString(aproksymacja_Irz[i]));
    }


}
