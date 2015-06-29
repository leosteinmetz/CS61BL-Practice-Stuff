public class ArrayFlattener {

	private int median(int a, int b, int c) {
		if ((a >= b && b >= c) || (a <= b && b <= c)) {
			return b;
		}
		return median(c, a, b);
	}

	public void flatten(int[] a) {

		int[] copy = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			copy[i] = a[i];
		}

		a[0] = median(copy[0], copy[a.length - 1], copy[1]);
		a[a.length - 1] = median(copy[0], copy[a.length - 1], copy[a.length - 2]);
		for (int i = 1; i < a.length - 1; i++) {
			a[i] = median(copy[i-1], copy[i], copy[i+1]);
		}


	}

	public static void main(String[] args) {
		int[] a = {1, 2, 5, 3, 7, 4, 8, 9, 5,3, 6, 3};
		ArrayFlattener f = new ArrayFlattener();
		f.flatten(a);
		for (int x : a) {
			System.out.print(x);
			System.out.print(" ");
		}
	}

}