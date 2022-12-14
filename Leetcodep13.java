package leetcode;

public class Leetcodep13 {
	public static int romantoint(String s) {
		int x = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'M') {
				x += 1000;
			} else if (s.charAt(i) == 'D') {
				x += 500;
			} else if (s.charAt(i) == 'C') {
				if (i + 1 < s.length()) {
					if (s.charAt(i + 1) == 'M') {
						x += 900;
						i += 1;
					} else if (s.charAt(i + 1) == 'D') {
						x += 400;
						i += 1;
					} else {
						x += 100;
					}
				} else {
					x += 100;
				}

			} else if (s.charAt(i) == 'L') {
				x += 50;
			} else if (s.charAt(i) == 'X') {
				if (i + 1 < s.length()) {
					if (s.charAt(i + 1) == 'C') {
						x += 90;
						i += 1;
					} else if (s.charAt(i + 1) == 'L') {
						x += 40;
						i += 1;
					} else {
						x += 10;
					}
				} else {
					x += 10;
				}

			} else if (s.charAt(i) == 'V') {
				x += 5;
			} else if (s.charAt(i) == 'I') {
				if (i + 1 < s.length()) {
					if (s.charAt(i + 1) == 'X') {
						x += 9;
						i += 1;
					} else if (s.charAt(i + 1) == 'V') {
						x += 4;
						i += 1;
					} else {
						x += 1;
					}

				} else {
					x += 1;
				}

			}

		}
		return x;

	}

	public static void main(String[] args) {
		String a = "MMCCCXCIX";
		System.out.println(romantoint(a));
	}
}
