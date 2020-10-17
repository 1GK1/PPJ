import java.time.Duration;
import java.time.Instant;

public class TestSort {
	
	ISort method;
	
	public TestSort() {
		
	}
	
	public TestSort(ISort method) {
		this.method = method;
	}
	
	
	public void setMethod(ISort method) {
		this.method = method;
	}


	public long test(double[] array) {
		Instant start = Instant.now();
		method.sort(array);
		return Duration.between(start, Instant.now()).toNanos();
	}
}
