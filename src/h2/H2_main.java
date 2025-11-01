package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr;
		boolean schalt;
		jahr = 2000;
		schalt = true;
		if (jahr % 4 == 0) {
			if (jahr % 100 == 0) {
				if (jahr % 400 == 0) {
					schalt = true;
				} else {
					schalt = false;
				}
			} else {
				schalt = true;
			}
		} else {
			schalt = false;
		}
	}
}
