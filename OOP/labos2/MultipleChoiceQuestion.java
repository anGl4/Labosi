package labos2;

class MultipleChoiceQuestion extends Question {
	private String choice1;
	private String choice2;
	private String choice3;
	int correctAnswer;
	int playerAnswer;
	
	public MultipleChoiceQuestion(String text, String choice1, String choice2, String choice3, int correctAnswer) {
		super(text);
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.choice3 = choice3;
		this.correctAnswer = correctAnswer;
	}
	
	public void setAnswer(int answer) {
		playerAnswer = answer;
	}
	
	@Override
	public String getText() {
		return super.getText() + ", A: " + choice1 + ", B: " + choice2 + ", C: " + choice3;
	}

	@Override
	public Boolean evaluate() {
		if (correctAnswer == playerAnswer) {
			numCorrect++;
			numTries++;
			return true;
		}
		numTries++;
		return false;
	}
	
	@Override
	public String toString() {
		return "Text: " + this.getText()
	      +  ", number of tries: " + numTries 
	      + ", number of correct answers: " + numCorrect;
	}
	
	
}
