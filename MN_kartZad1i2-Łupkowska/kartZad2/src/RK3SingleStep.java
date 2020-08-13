public class RK3SingleStep implements ODESingleStep {
    double k1;
    double k2;
    double k3;
    double xEnd;

    @Override
    public double singleStep(FirstOrderODE ode, double t, double x, double h) {

        k1 = ode.f(t,x);
        k2 = ode.f(t+h/2, x+k1*(h/2));
        k3 = ode.f(t+h, x-h*k1+2*h*k2);
        double nach = (1./6.)* (k1+4*k2+k3);
        xEnd = x + h*nach;
        return xEnd;
    }
}
