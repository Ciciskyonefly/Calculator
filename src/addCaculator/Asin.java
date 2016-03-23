package addCaculator;

public class Asin extends MathOperation {

	@Override
	public int getNumberOfParameters() {
		return 1;
	}

	@Override
	public double compute(double[] parameters) {
		return Math.asin(parameters[0]);
	}

	@Override
	public int getPriority(String s) {
		priority a = new priority();
		int b = a.getPriority(s);
		return b;
	}

	@Override
	public int operatorPosition() {
		return 0;
	}

	@Override
	public String getName() {
		return null;
	}

}
