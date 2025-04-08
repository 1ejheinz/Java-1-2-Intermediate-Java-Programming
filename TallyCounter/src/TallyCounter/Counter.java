package TallyCounter;

public class Counter {
	private int value = 0;

	public Counter() {
		this.value = 0;
	}

	private static final int _CLICK_MAXIMUM = 9999;

	public void clickValue1() {
		if (value < _CLICK_MAXIMUM) {
			value++;
		} else {
			System.out.println("Maximum count reached.");
		}
	}

	public void clickValue2() {
		if (value <= _CLICK_MAXIMUM - 2) {
			value += 2;
		} else {
			System.out.println("Maximum count reached.");
		}
	}

	public int getValue() {
		return value;
	}

	public void reset() {
		value = 0;
	}
}
