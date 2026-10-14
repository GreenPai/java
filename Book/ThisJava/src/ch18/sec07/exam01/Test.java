package ch18.sec07.exam01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("첫번째 Scanner");
		Scanner sc = new Scanner("1222222222222");
		long start = System.nanoTime();
		long n1 = sc.nextLong();
		//String str1 = sc.next();
		long end = System.nanoTime();
		System.out.println(end - start);
		
		System.out.println("두번째 버퍼");
		BufferedReader br = new BufferedReader(new StringReader("1222222222222")); 
		long start2 = System.nanoTime();
		long n2 = Long.parseLong(br.readLine());
		//String str2 = br.readLine();
		long end2 = System.nanoTime();
		System.out.println(end2 - start2);
		
		System.out.println("성능 차이는 " + ((end-start) - (end2 - start2)));
	}
}
