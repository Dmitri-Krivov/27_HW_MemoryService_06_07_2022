package telran.array.tools;

public class MemoryService {
	public static int getMaxArrayMemory() {
		int maxVal = Integer.MAX_VALUE;
		int minVal = 0;
		int size = 0;
		while (minVal<=maxVal ) {
			int mid = minVal + (maxVal - minVal) / 2;
			try {
				int[] arr = new int[mid];
				minVal = mid + 1;
				size = mid;
				System.out.println("try = " + mid);

			} catch (OutOfMemoryError e) {
				maxVal = mid - 1;
				System.out.println("catch = " + mid);

			}
		}

		System.out.println("MAX = " + size);

		return size;
	}
}
