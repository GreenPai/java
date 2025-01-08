package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 날짜 : 2025-01-08
 * 이름 : 우상호
 */
public class P10807_Count {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		// String[] strs = br.readLine().split(" ");
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		
		String num = br.readLine();
		
		int cnt = 0;
		
		while (st.hasMoreTokens()) {
			if(st.nextToken().equals(num)) cnt++;
		}
		
		System.out.println(cnt);
		
	}
	
}
