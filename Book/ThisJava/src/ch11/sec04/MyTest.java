package ch11.sec04;

import java.io.FileWriter;
import java.io.IOException;

import javax.management.RuntimeErrorException;

public class MyTest {
	public static void main(String[] args) {
		FileWriter file = null;
        try {
            file = new FileWriter("data.txt");
            file.write("Hello World");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        	// close()에서 발생하는 예외를 처리하기 위해서 아래와같이 바꿀수도 있지만 코드가 복잡해져서 좋지않다.
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
	}
}
