package edu.ib;

public class Main {

    public static void main(String[] args) {

        RegulaFalsi regulaFalsi1 = new RegulaFalsi(new LiczFunkcje());
        //RegulaFalsi regulaFalsi2 = new RegulaFalsi((x) -> Math.exp(-x) - x);
        RegulaPunktuStalego regulaPunktuStalego = new RegulaPunktuStalego(new LiczFunkcje());
        MetodaStycznych metodaStycznych = new MetodaStycznych((new LiczFunkcje()));
        MetodaSiecznych metodaSiecznych = new MetodaSiecznych((new LiczFunkcje()));
        Bisekcja bisekcja = new Bisekcja((new LiczFunkcje()));


//        double solutionRegulaFalsi = regulaFalsi1.solver(0, 1,   0.56714329, 0.001);
//        System.out.println("Miejsce zerowe regula falsi:");
//        System.out.println(solutionRegulaFalsi );
//        System.out.println(regulaFalsi1.listEt + "falsi et");
//        System.out.println(regulaFalsi1.listEa + "falsi ea");
//        System.out.println();
//
//        System.out.println("lista xr dla reguly punktu stalego 'zadania do wykonania' x0=1, m=0.5");
//        double solutionRegulaPunktuStalegoA = regulaPunktuStalego.solverA(1,0.5,5, 0.56714329);
//        System.out.println("lista xr dla reguly punktu stalego 'zadania do wykonania' x0=1, m=2");
//        double solutionRegulaPunktuStalegoA1 = regulaPunktuStalego.solverA(1,2,5, 0.56714329);
//        System.out.println();
//        double solutionRegulaPunktuStalegoB = regulaPunktuStalego.solverB(0,0.56714329, 0.001);
//        System.out.println(solutionRegulaPunktuStalegoB);
//
//        double solutionMetodaStycznych = metodaStycznych.solver(0,   0, 0.001);
//        System.out.println(solutionMetodaStycznych + "solution styczne");
//        System.out.println();

//        double solutionMetodaSiecznych = metodaSiecznych.solver(0,   50, 0.001);
//        System.out.println(solutionMetodaSiecznych + "solution sieczne");
//        System.out.println();
////
        double solutionBisekcja = bisekcja.solver(0,2,0.56714329,0.001);
        System.out.println(solutionBisekcja + "solution bisekcja");
        System.out.println();

//        System.out.println(regulaFalsi1.listEt + "falsi et");
//        System.out.println(regulaPunktuStalego.listEt + "punkt et");
//        System.out.println(metodaSiecznych.listEt + "sieczne et");
//        System.out.println(metodaStycznych.listEt + " styczne et");
//        System.out.println(bisekcja.listEt+ "bisekcja et");



    }

}
