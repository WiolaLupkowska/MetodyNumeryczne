import java.util.ArrayList;

public class MetodaSiecznych {

    private Funkcja f;
    public MetodaSiecznych(Funkcja f){
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
        double xrOlder;
        double xr=x0;
        double xrNew=0;
        double ea=1;
        double xminusjeden=0;

        while(ea>zadanyBlad){
            xrOlder=xrOld;
            xrOld=xr;
            xr= xr-((licz.funkcjaZ(xr)*(xrOlder-xr))/(licz.funkcjaZ(xrOlder)-licz.funkcjaZ(xr)));  //przyblizenie rozwiazania
            xrNew=xr;
            ea= liczEa(xrNew,xrOld);
            listEa.add(ea);
            listXr.add(xr);
        }

        return listXr.get(listXr.size()-1);

    }



}
