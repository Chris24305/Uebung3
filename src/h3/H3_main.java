package h3;

public class H3_main {
	public static void main(String[] args) {
		int max, fix, wartend;
		boolean istVoll;
		max = 100;
		fix = 101;
		wartend = 200;
		istVoll = false;
		if (max - fix > 0) { 
			if (max < fix + wartend) { 
				wartend += fix - max;
				fix = max;
				istVoll = true;
			} else {
				fix += wartend;
				wartend = 0;
				if (max - fix == 0) {	
					istVoll = true;
				} else {
					istVoll = false;
				}
			}
		} else {
			istVoll = true;
		}
	}
}
