package ch18.sec07.exam01;

public class BufferExample {
	public static void main(String[] args) throws Exception {
		int cnt1 = 0;
		int cnt2 = 0;
		long start = System.nanoTime();
		
		for(int i=0; i<5; i++) {
			cnt1++;
		}
		
		long end = System.nanoTime();
		
		System.out.println(end - start);
		
		long t1 = System.nanoTime();
		
		while(true) {
			cnt2++;
			if(cnt2==5) break;
		}
		long t2 = System.nanoTime();
		
		System.out.println(t2 - t1);
		
		System.out.println(cnt1 + " " + cnt2);
		
		
		
	}

}
