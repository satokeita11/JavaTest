package jp.co.aforc.test;

public class MinMax {

	public int getMaxValue(int a, int b, int c) {

		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	public int getMInValue(int a, int b, int c) {
		int min = a;

		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

}