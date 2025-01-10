package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10810ball {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int len = Integer.parseInt(st.nextToken());
		int[] baskets = new int[len];
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			
			for(int j=start-1; j<=end-1; j++) {
				baskets[j] = number;
			}
		}
		
		for(int i=0; i<len; i++) {
			System.out.print( baskets[i] + " ");
		}
	}

}
