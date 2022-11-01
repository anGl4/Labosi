package labos2;

public class Main2 {

	public static void main(String[] args) {

		DoubleQuestion q1 = new DoubleQuestion("What is the value of number Pi, rounded to three decimal places",
				3.141);
		System.out.println(q1.getText()); // What is the value of number Pi, rounded to three decimal places
		q1.setAnswer(3.0);
		q1.evaluate(); // false
		q1.evaluate(); // false
		q1.evaluate(); // false

		q1.setAnswer(4.0);
		q1.evaluate(); // false

		q1.setAnswer(3.141);
		q1.evaluate(); // true
		q1.evaluate(); // true

		System.out.println(q1); // Text: What is the value of number Pi, rounded to two decimal

		MultipleChoiceQuestion q2 = new MultipleChoiceQuestion("Calculate 2 to the power of 5", "16", "32", "64", 2);
		System.out.println(q2.getText()); // Calculate 2 to the power of 5, A: 16, B: 32, C: 64
		q2.setAnswer(1);
		q2.setAnswer(2);
		q2.setAnswer(3);
		q2.evaluate(); // false

		q2.setAnswer(2);
		q2.evaluate(); // true

		q2.setAnswer(2);
		q2.evaluate(); // true

		System.out.println(q2);

	}

}
