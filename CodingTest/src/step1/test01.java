package step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class test01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] chases = {1,1,2,2,2,8}; 
		int[] answer = new int[6];
		
		for(int i=0; i<6; i++) {
			answer[i] = chases[i] - Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<5; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.print(answer[5]);
		}

}
