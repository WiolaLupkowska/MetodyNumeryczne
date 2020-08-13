import java.util.ArrayList;

public class MetodaStycznych {

    private Funkcja f;
    public MetodaStycznych(Funkcja f){
        this.f = f;
    }

    public double liczEa (double xrNew, double xrOld){
        return Math.abs((xrNew-xrOld)/xrNew)*100;
    }

    ArrayList<Double> listEa = new ArrayList<Double>();
    ArrayList<Double> listXr = new ArrayList<Double>();

    public double solver(double x0, double xrDokladne, double zadanyBlad){

        LiczFunkcje licz = new LiczFunkcje();
        double xrOld=xrDokladne;
        double xr=x0;
        double xrNew=0;
        double ea=1;

        while(ea>zadanyBlad){
            xrOld=xr;
            xr= xr-(licz.funkcjaZ(xr)/(-Math.exp(-xr)-1));  //przyblizenie rozwiazania
            xrNew=xr;
            double et = Math.abs(xr-1.4257)/1.4257;
            ea= liczEa(xrNew,xrOld);
            listEa.add(ea);
            listXr.add(xr);
        }
        System.out.println("Miejsce zerowe z styczne:");
        return listXr.get(listXr.size()-1);

    }


}
