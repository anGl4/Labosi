package labos1;


public class Task {
	
	//prvi zadatak
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	
	//drugi zadatak
	static void generate(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int)(Math.random() * 11 + 5);
		}
	}
}
