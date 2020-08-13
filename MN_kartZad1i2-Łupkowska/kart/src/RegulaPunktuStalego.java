import java.util.ArrayList;

public class RegulaPunktuStalego {

    private Funkcja f;

    public RegulaPunktuStalego(Funkcja f) { //tym ustawiam funkcję jakiej miejsc zerowych chce szukac
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
            xr= licz.funkcjaZ(xr)+xr;  //przyblizenie rozwiazania
            xrNew=xr;
            ea= liczEa(xrNew,xrOld);
            listXr.add(xr);


        }

        return listXr.get(listXr.size()-1);
    }

}
