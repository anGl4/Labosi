package labos4.zad1;

public class Main {
	public static void main(String[] args) {
		String line = "\t\tAmogus\t";
		int i = 0;
		while (line.startsWith("\t")) {
			line = line.replaceFirst("\t", "");
			i++;
		}

		for (int k = 0; k < i; k++) {
			line = line.replaceFirst("", "  ");
		}
		System.out.println(line);
	}
}
