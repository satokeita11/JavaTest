package jp.co.aforc.test;

import java.util.Random;

public class PracticeTest8 {
	public void printHello() {
		System.out.println("Hello");
	}

	public void printRandomMessage() {
		int n = (int) (3 * Math.random());
		if (n == 0) {
			System.out.println("こんばんは");
		} else if (n == 1) {
			System.out.println("こんにちは");
		} else {
			System.out.println("おはよう");
		}
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printMessage(String message, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public void printRectangleArea(double height, double width) {
		double area = height * width;
		System.out.println("長方形の面積は" + area);
	}

	public String getWeatherForecast() {
		String[] days = { "今日", "明日", "明後日" };
		String[] weatherConditions = { "晴れ", "曇り", "雨", "雷" };

		Random random = new Random();
		String day = days[random.nextInt(days.length)];
		String weather = weatherConditions[random.nextInt(weatherConditions.length)];

		return day + "の天気は" + weather + "でしょう";
	}

	public boolean isEvenNumber(int value) {
		return value % 2 == 0;
	}

	public String getMessage(String name, boolean isKid) {
		if (isKid) {
			return "こんにちは" + name + "ちゃん";
		} else {
			return "こんにちは" + name + "さん";
		}
	}

	public String getLongestString(String[] array) {
		if (array == null || array.length == 0) {
			return null;
		}

		String longestString = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i].length() > longestString.length()) {
				longestString = array[i];
			}
		}

		return longestString;
	}
}