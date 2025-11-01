package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben, monEingang;
		int rating;
		boolean warnhinweis, negativ;
		guthaben = 10;
		monEingang = 3;
		rating = 1;
		warnhinweis = true;
		negativ = false;
		if (guthaben < 0) {
			negativ = true;

		} else {
			negativ = false;
			rating = rating + 2;
			if(guthaben>0) {
				rating = rating + 1;
			}
		}
		System.out.println(rating);
		System.out.print(negativ);
	}
}
