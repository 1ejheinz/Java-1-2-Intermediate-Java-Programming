package TallyCounter;

public class EntryPoint {
	public static void main(String[] args) {
		double convertedPoints = StaticDemoClass.convertInchToPoint(8.5);
		System.out.println("Point width of standard letter size paper: " + convertedPoints);

		Counter click1 = new Counter();
		Counter click2 = new Counter();

		click1.clickValue1();
		click2.clickValue2();

		System.out.println("Counter 1 value after clickValue1: " + click1.getValue());
		System.out.println("Counter 2 value after clickValue2: " + click2.getValue());
	}
}
