package jp.co.aforc.test;

public class Main {
	public static void main(String[] args) {
		PracticeTest8 test = new PracticeTest8();

		test.printHello();

		test.printRandomMessage();

		test.printMessage("テストメッセージ");

		test.printMessage("繰り返しメッセージ", 3);

		test.printRectangleArea(3.5, 4.2);

		System.out.println(test.getWeatherForecast());

		int num = 10;
		System.out.println(num + "は偶数ですか？: " + test.isEvenNumber(num));

		String name = "太郎";
		boolean isKid = true;
		System.out.println(test.getMessage(name, isKid));

		String[] strings = { "apple", "banana", "grape", "watermelon" };
		System.out.println("最も長い文字列: " + test.getLongestString(strings));

		Person person1 = new Person("Alice", 25);
		Person person2 = new Person("Bob", 18);

		System.out.println(person1.getName() + "は大人ですか？: " + person1.isAdult(person2));
		System.out.println(person2.getName() + "は大人ですか？: " + person2.isAdult(person2));
	}
}
