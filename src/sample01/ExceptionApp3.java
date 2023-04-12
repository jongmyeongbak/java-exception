package sample01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp3 {

	public static void readFile(String path) throws IOException, FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String text = br.readLine();
		System.out.println("파일내용 -> " + text);
		br.close();
	}
	
	public static void writeFile(String path, String content) throws FileNotFoundException, IOException {
		FileWriter writer = new FileWriter(path);
		writer.write(content);
		writer.close();
	}
	
	public static void main(String[] args) {
		try {
			writeFile("src/sample01/sample03.txt", "예외처리 위임하기");
			readFile("src/sample01/sample03.txt");
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 읽기 쓰기 작업 중 오류가 발생하였습니다.");
		}
	}
}
