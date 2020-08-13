import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.ode.sampling.StepHandler;
import org.apache.commons.math3.ode.sampling.StepInterpolator;

import java.util.ArrayList;

public class LotkaVolterraPath implements StepHandler {

    ArrayList<Double> time = new ArrayList<>();
    ArrayList<Double> preys = new ArrayList<>();
    ArrayList<Double> predators = new ArrayList<>();

    public ArrayList<Double> getTime() {
        return time;
    }

    public ArrayList<Double> getPreys() {
        return preys;
    }

    public ArrayList<Double> getPredators() {
        return predators;
    }

    @Override
    public void init(double t0, double[] y0, double t) {

    }

    @Override
    public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {

        time.add(interpolator.getCurrentTime());
        double[] x = interpolator.getInterpolatedState();
        preys.add(x[0]);
        predators.add(x[1]);



    }
}




