import java.util.Arrays;

public class ParallelSort implements ISort {
	public void sort(double[] arr) {
		Arrays.parallelSort(arr);
	}
}
