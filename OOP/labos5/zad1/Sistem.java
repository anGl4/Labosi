package labos5.zad1;

public class Sistem {
	static class Student {
		public String name, surname;
		public int age;
		public int[] grades;

		public Student(String name, String surname, int age, int[] grades) {
			super();
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.grades = grades;
		}

		public String getName() {
			return name;
		}

		public String getSurname() {
			return surname;
		}

		public int getAge() {
			return age;
		}

		public double averageGrade() {
			double zbroj = 0;
			for (int i = 0; i < grades.length; i++)
				zbroj += grades[i];
			return zbroj / grades.length;
		}
	}

	static class GermanStudent extends Student {
		int[] gradesInCroat;

		public GermanStudent(String name, String surname, int age, int[] grades) {
			super(name, surname, age, grades);
			gradesInCroat = new int[grades.length];
			for (int i = 0; i < gradesInCroat.length; i++) {
				gradesInCroat[i] = 6 - grades[i];
			}
		}

		@Override
		public double averageGrade() {
			double zbroj = 0;
			for (int i = 0; i < gradesInCroat.length; i++)
				zbroj += gradesInCroat[i];
			return zbroj / grades.length;
		}

	}

	static class AmericanStudent extends Student {
		int[] gradesInCroat;

		public AmericanStudent(String name, String surname, int age, char[] grades) {
			super(name, surname, age, null);
			gradesInCroat = new int[grades.length];
			for (int i = 0; i < grades.length; i++) {
				if (grades[i] == 'A')
					gradesInCroat[i] = 5;
				else if (grades[i] == 'B')
					gradesInCroat[i] = 4;
				else if (grades[i] == 'C')
					gradesInCroat[i] = 3;
				else if (grades[i] == 'D')
					gradesInCroat[i] = 2;
				else if (grades[i] == 'F')
					gradesInCroat[i] = 1;
			}
		}

		@Override
		public double averageGrade() {
			double zbroj = 0;
			for (int i = 0; i < gradesInCroat.length; i++)
				zbroj += gradesInCroat[i];
			return zbroj / gradesInCroat.length;
		}

	}

	public static void main(String[] args) {
		int[] gradesCroat = { 3, 4, 5 };
		int[] gradesGerman = { 1, 2, 1 };
		char[] gradesAmerican = { 'A', 'B', 'A' };

		Student croat = new Student("Mate", "Juric", 30, gradesCroat);
		Student german = new GermanStudent("Hans", "Zimmer", 40, gradesGerman);
		Student american = new AmericanStudent("John", "Doe", 20, gradesAmerican);

		System.out.println(croat.averageGrade());
		System.out.println(german.averageGrade());
		System.out.println(american.averageGrade());
	}

}
