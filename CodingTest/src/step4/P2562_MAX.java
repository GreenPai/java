package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class P2562_MAX {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = 0;
		int index = 0;
		
		for(int i=1; i<=9; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n>max) {
				index = i;
				max = n;
			}
		}
		
		bw.write(max + "\n" + index);
		bw.flush();
		bw.close();
		br.close();
		
		
	}

}
