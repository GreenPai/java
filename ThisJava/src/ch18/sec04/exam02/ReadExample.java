package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) {
		
		
		// 문자씩 열기
		try {
			Reader reader = null;
			reader = new FileReader("C:/Temp/test2.db");
			
			while(true) {
				int data = reader.read();
				
				if(data == -1) break;
				System.out.println((char)data);
			}
			
			reader.close();
			System.out.println();
			
			//문자 배열로 읽기
			reader = new FileReader("C:/Temp/test2.db");
			char[] data = new char[100];
			while(true) {
				int num = reader.read(data);
				if(num==-1) break;
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
