package util;

public class chkJumin {

	public static void main(String[] args) {
		
		String jumin = "7702251646514";
		
		System.out.println("value=" + isJumin(jumin));
		
	}

	public static boolean isJumin(String jumin) {
		boolean isKorean = true;
		int check = 0;

		if (jumin == null || jumin.length() != 13)
			return false;
		if (Character.getNumericValue(jumin.charAt(6)) > 4
				&& Character.getNumericValue(jumin.charAt(6)) < 9) {
			isKorean = false;
		}

		for (int i = 0; i < 12; i++) {
			if (isKorean)
				check += ((i % 8 + 2) * Character.getNumericValue(jumin
						.charAt(i)));
			else
				check += ((9 - i % 8) * Character.getNumericValue(jumin
						.charAt(i)));
		}

		if (isKorean) {
			check = 11 - (check % 11);
			check %= 10;
		} else {
			int remainder = check % 11;
			if (remainder == 0)
				check = 1;
			else if (remainder == 10)
				check = 0;
			else
				check = remainder;

			int check2 = check + 2;
			if (check2 > 9)
				check = check2 - 10;
			else
				check = check2;
		}

		if (check == Character.getNumericValue(jumin.charAt(12)))
			return true;
		else
			return false;

	}

}
