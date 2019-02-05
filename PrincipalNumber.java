package principal;

public class PrincipalNumber {

	public static void main(String[] args) {
		Integer numberC = c(101, 12345);
		System.out.println("C: " + numberC);
	}

	public static Integer c(int a, int b) {

		StringBuilder builder = new StringBuilder();

		char[] arrayA = Integer.valueOf(a).toString().toCharArray();
		char[] arrayB = Integer.valueOf(b).toString().toCharArray();

		int max = arrayA.length >= arrayB.length ? arrayA.length
				: arrayB.length;

		for (int i = 0; i < max; i++) {

			if (arrayA.length > i) {
				builder.append(arrayA[i]);
			}

			if (arrayB.length > i) {
				builder.append(arrayB[i]);
			}
		}

		Integer merge = Integer.valueOf(builder.toString());
		System.out.println("Merge: " + merge);

		if (merge > 1000000) {
			return -1;
		}

		return merge;
	}

}
