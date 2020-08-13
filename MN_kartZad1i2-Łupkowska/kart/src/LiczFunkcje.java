public class LiczFunkcje implements Funkcja {

double roK=200;
double roW=1000;

    @Override
    public double funkcjaZ(double h) {
        return 4./3.-Math.pow(h,2)*((3-h)/3)-4./3.*(200./1000.);
    }
}
