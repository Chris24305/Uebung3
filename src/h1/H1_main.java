package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben, monEingang;
		int rating;
		boolean warnhinweis, negativ;
		guthaben = -100;
		monEingang = 200;
		rating = -2;
		warnhinweis = true;
		negativ = false;
		//
		if (guthaben < 0) {
			negativ = true;
			if (-1*monEingang <= guthaben) {
				rating += 1;
			} else {
				rating -= 1;
			}
		} else {
			negativ = false;
			rating += 2;
			if (guthaben > 0) {
				rating += 1;
			}
		}
		warnhinweis = false;
		if (guthaben<0) {
			if (-1*monEingang > guthaben) {
				if (rating <0) {
					warnhinweis = true;
				}
			}
		}
		System.out.print("negativ:" + negativ + ", rating:" + rating+", warnhinweis:"+warnhinweis);
	}
}
