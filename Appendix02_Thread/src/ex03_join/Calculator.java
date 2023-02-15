package ex03_join;

public class Calculator implements Runnable {

	private long total;
	private long begin;
	private long end;
	
	public Calculator(long begin, long end) {
		this.begin = begin;
		this.end = end;
	}
	
	public void add() {
		for(long n = begin; n <= end; n++) {
			total += n;
		}
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}
	
	@Override
	public void run() {
		add();
	}
	
}
