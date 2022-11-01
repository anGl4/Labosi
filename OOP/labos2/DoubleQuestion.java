package labos2;

class DoubleQuestion extends Question {
	private double correctanswer;
	private double playerAnswer;

	public DoubleQuestion(String text, double correctanswer) {
		super(text);
		this.correctanswer = correctanswer;
	}
	
	public void setAnswer(double answer) {
		playerAnswer = answer;
	}

	@Override
	public Boolean evaluate() {
		if (Math.abs(correctanswer - playerAnswer) <= 1e-8) {
			numCorrect++;
			numTries++;
			return true;
		}
		numTries++;
		return false;
	}
}
