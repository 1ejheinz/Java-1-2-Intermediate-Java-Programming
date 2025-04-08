package TallyCounter;

public class StaticDemoClass {
	private static int _POINTS_PER_INCH = 72;

	public static double convertInchToPoint(double inchesIn) {
		double numPoints = inchesIn * _POINTS_PER_INCH;
		return numPoints;
	}
}
