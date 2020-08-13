package edu.ib;

import java.util.ArrayList;

public class Bisekcja {

    private Funkcja f;
    public Bisekcja(Funkcja f){this.f=f;}

    public double liczEa (double xrNew, double xrOld){
        return Math.abs((xrNew-xrOld)/xrNew)*100;
    }

    ArrayList<Double> listEa = new ArrayList<Double>();
    ArrayList<Double> listEt = new ArrayList<Double>();
    ArrayList<Double> listXr = new ArrayList<Double>();

    public double solver(double xl, double xu, double xrDokladne, double zadanyBlad){

        LiczFunkcje licz = new LiczFunkcje();
        double xrOld=xrDokladne;
        double xr=0;
        double xrNew=0;
        double ea=1;

        while(ea>zadanyBlad){
            xrOld=xr;
            xr= (xl-xu)/2;
            xrNew=xr;
            double et = Math.abs(xr-0.56714329)/0.56714329;
            ea= liczEa(xrNew,xrOld);
            listEa.add(ea);
            listEt.add(et);
            listXr.add(xr);


            if (licz.funkcjaZ(xl) * licz.funkcjaZ(xu)<0) {
                xu = xr;
            }else if (licz.funkcjaZ(xu)*licz.funkcjaZ(xu)>0) {
                xl = xr;
            }else if (licz.funkcjaZ(xl)*licz.funkcjaZ(xr)==0){
                System.out.println("MAM PIERWIASTEK");
                //break;
            }
        }
        System.out.println(listEt + "bisekcja błąd et");
        System.out.println(listEa + "bisekcja błąd ea");
        return listXr.get(listXr.size()-1);
    }
}
