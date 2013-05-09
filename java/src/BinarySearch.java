import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class BinarySearch {

	public static int integerBinarySearchFirstTrue(IntPredicate p, int from, int to) {
		int lo = from - 1;
		int hi = to + 1;
		while (hi - lo > 1) {
			int mid = (lo + hi) / 2;
			if (!p.test(mid)) {
				lo = mid;
			} else {
				hi = mid;
			}
		}
		return hi;
	}

	public static double doubleBinarySearchFirstTrue(DoublePredicate p, double lo, double hi) {
		for (int step = 0; step < 1000; step++) {
			double mid = (lo + hi) / 2;
			if (!p.test(mid)) {
				lo = mid;
			} else {
				hi = mid;
			}
		}
		return hi;
	}

	// Usage example
	public static void main(String[] args) {
		int[] a = {1, 2, 5, 6, 7};
		System.out.println(3 == integerBinarySearchFirstTrue(i -> a[i] >= 6, 0, a.length - 1));
		System.out.println(Math.sqrt(2) == doubleBinarySearchFirstTrue(x -> x * x >= 2, 0, 2));
	}
}
