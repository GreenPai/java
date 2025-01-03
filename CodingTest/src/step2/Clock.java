package step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Clock {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		if(minute - 45 < 0) {
			minute = minute - 45 + 60;
			hour -= 1;
			if(hour<0) hour = 23;
		}else {
			minute = minute - 45;
		}
		
		System.out.println(hour + " " + minute);
	}

}
