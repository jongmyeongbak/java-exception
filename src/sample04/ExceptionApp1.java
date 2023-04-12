package sample04;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp1 {

	public static void writeText1(String text) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/sample04/sample.txt");
			writer.write("연습1");
			writer.close();
		} catch (IOException e) {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e1) {
			}
			throw new RuntimeException("입출력오류", e);
		}
	}
	
	public static void writerText2(String text) {
		FileWriter writer = null;
		try {
			writer = new FileWriter("src/sample04/sample.txt");
			writer.write("연습1=2");
		} catch (IOException e) {
			throw new RuntimeException("입출력오류", e);
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
			}
		}
	}
	
	public static void writerText3(String text) {
		try (FileWriter writer = new FileWriter("src/sample04/sample.txt")) {
			writer.write("연습2");
			writer.write("연습2");
			writer.write("연습2");
			writer.write("연습2");
		} catch (IOException e) {
			throw new RuntimeException("입출력 오류", e);
		}
	}
}
