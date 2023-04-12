package sample01;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp1 {

	public static void main(String[] args) {
		// 예외처리
		/*
		 * try-catch 구분을 사용해 예외처리하기
		 * 
		 */
		
		try {
			FileWriter writer = new FileWriter("src/sample01/sample01.txt");
			writer.write("예외처리 실습해보기");
			writer.close();
		} catch (IOException e) {
			System.out.println("IOException이 발생하였습니다.");
		}
	}
}
