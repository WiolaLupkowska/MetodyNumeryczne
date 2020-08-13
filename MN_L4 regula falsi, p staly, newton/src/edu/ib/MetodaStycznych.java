package edu.ib;

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
    ArrayList<Double> listEt = new ArrayList<Double>();
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
            double et = Math.abs(xr-0.56714329)/0.56714329;
            ea= liczEa(xrNew,xrOld);
            listEa.add(ea);
            listEt.add(et);
            listXr.add(xr);
        }
        System.out.println(listEt + "  błąd Et, styczne");
        System.out.println(listEa + "  błąd Ea, styczne");
        System.out.println();
        System.out.println("Miejsce zerowe z styczne:");
        return listXr.get(listXr.size()-1);

    }


}
