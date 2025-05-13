import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count aWAL:" + counter.getCount());
		
		counter.increment();
                counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
                counter.decrement();
		
		System.out.println("Count BARU BANGET:" + counter.getCount());
		
	}

}
