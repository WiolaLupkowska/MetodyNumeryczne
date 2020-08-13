public class FirstOrderODESolver { //rozwiazywanie rownania rozniczkowego 1 st



    private ODESingleStep odeSingleStep;
    private StepHandler stepHandler;

    public FirstOrderODESolver(ODESingleStep odeSingleStep) { //konstruktor pobierajacy krok, ustawia krok
        this.odeSingleStep = odeSingleStep;
    }

    public double integrate(FirstOrderODE ode, double tStart, double xStart, double tStop, int n){ //First order ode daje f(t,x), n=liczba krokow

        double h = (tStop - tStart)/n;      //dlugosc kroku
        double x= xStart;                   //xPocz x0
        double t = tStart;                  //tPocz t0

        for(int i = 0; i<n; i++){                           //i<liczba krokow
            if(stepHandler != null)
                stepHandler.handler(t,x);
            x = odeSingleStep.singleStep(ode, t, x, h);     //ODESingleStep liczony inaczej dla kazdej z metod (euler, mofyfEuler, rk)
            t += h;

        }
        if(stepHandler != null)
            stepHandler.handler(t,x);
        return x;
    }


}
