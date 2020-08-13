public class Main {

 public static double xrDokladne = 1.4257;

    public static void main(String[] args) {

        RegulaFalsi regulaFalsi = new RegulaFalsi(new LiczFunkcje());
        RegulaPunktuStalego regulaPunktuStalego = new RegulaPunktuStalego(new LiczFunkcje());
        MetodaStycznych metodaStycznych = new MetodaStycznych((new LiczFunkcje()));
        MetodaSiecznych metodaSiecznych = new MetodaSiecznych((new LiczFunkcje()));


        double solutionRegulaPunktu = regulaPunktuStalego.solver(0,    xrDokladne, 0.001);
        System.out.println("Regula Punktu :");
        System.out.println(solutionRegulaPunktu );

        double solutionRegulaFalsi = regulaFalsi.solver(0, 1,   xrDokladne, 0.001);
        System.out.println("Miejsce zerowe regula falsi:");
        System.out.println(solutionRegulaFalsi );


        double solutionMetodaStycznych = metodaStycznych.solver(0,   xrDokladne, 0.001);
        System.out.println(solutionMetodaStycznych + "  solution styczne");
        System.out.println();

        double solutionMetodaSiecznych = metodaSiecznych.solver(0,   xrDokladne, 0.001);
        System.out.println(solutionMetodaSiecznych + "  solution sieczne");
        System.out.println();



    }

}
