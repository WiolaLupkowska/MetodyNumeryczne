package edu.ib;

import java.util.ArrayList;

public class RegulaPunktuStalego {

    private Funkcja f;

    public RegulaPunktuStalego(Funkcja f) { //tym ustawiam funkcję jakiej miejsc zerowych chce szukac
        this.f = f;
    }

    public double liczEa (double xrNew, double xrOld){
        return Math.abs((xrNew-xrOld)/xrNew)*100;
    }

    public double solverA(double x0, double m, int maxIter, double xrDokladne){

            LiczFunkcje licz = new LiczFunkcje();
            double xrOld=xrDokladne;
            //double xrOld=0;
            double x= x0; //=1
            double xr=1;
            double xrNew=0;
        double ea=0;
        xrOld=0;
        ArrayList<Double> listEa = new ArrayList<Double>();
        ArrayList<Double> listEt = new ArrayList<Double>();
        ArrayList<Double> listXr = new ArrayList<Double>();


        for (int i=0; i<maxIter; i++){

            xr= m*x;
            xrNew=xr;
            double et = Math.abs(xr-0.56714329)/0.56714329;
            ea= liczEa(xrNew,xrOld);
            listEa.add(ea);
            listEt.add(et);
            listXr.add(xr);
            x=xr;

        }
        System.out.println(listXr);

        return listXr.get(maxIter-1);
        // tu cala idea liczenia;
        //tu laduje ten mianownik duzy z ucyciem funkcjaZ
    }

    ArrayList<Double> listEa = new ArrayList<Double>();
    ArrayList<Double> listEt = new ArrayList<Double>();
    ArrayList<Double> listXr = new ArrayList<Double>();

    public double solverB(double x0, double xrDokladne, double zadanyBlad){

        LiczFunkcje licz = new LiczFunkcje();
        double xrOld=xrDokladne;
        double xr=x0;
        double xrNew=0;
        double ea=1;


        while(ea>zadanyBlad){
            xrOld=xr;
            xr= licz.funkcjaZ(xr)+xr;  //przyblizenie rozwiazania
            xrNew=xr;
            double et = Math.abs(xr-0.56714329)/0.56714329;
            ea= liczEa(xrNew,xrOld);
            listEa.add(ea);
            listEt.add(et);
            listXr.add(xr);


        }
        System.out.println(listEt + "  błąd Et,punkt staly");
        System.out.println(listEa + "  błąd Ea, punkt staly");
        System.out.println("Miejsce zerowe z metody punktu stałego:");
        return listXr.get(listXr.size()-1);
    }

}
