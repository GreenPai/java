package step2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Oven {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int dice1 = Integer.parseInt(st.nextToken());
		int dice2 = Integer.parseInt(st.nextToken());
		int dice3 = Integer.parseInt(st.nextToken());
		
		int money = 0;
		
		if(dice1 == dice2 && dice2 == dice3) {
			money = 10000 + dice1 * 1000;
		}else if(dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
			int num = 0;
			if(dice1 == dice2) num = dice1;
			if(dice2 == dice3) num = dice2;
			if(dice3 == dice1) num = dice1;
			
			money = 1000 + num*100;
		}else {
			int num = Math.max(Math.max(dice1, dice2), dice3);
			money = num * 100;
		}
		
		bw.write(String.valueOf(money));
		bw.flush();
		bw.close();
		
	}

}
