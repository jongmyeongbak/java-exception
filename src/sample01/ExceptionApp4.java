package sample01;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp4 {

//	public static void test1() throws IOException {
//		System.out.println("예외처리 위임하기 연습");
//		test2();
//	}
//	
//	public static void test2() throws IOException {
//		System.out.println("예외처리 위임하기 연습");
//		test3();
//	}
//	
//	public static void test3() throws IOException {
//		System.out.println("예외처리 위임하기 연습");
//		test4();
//	}
//	
//	public static void test4() throws IOException {
//		FileWriter writer = new FileWriter("src/sample01/sample04.txt");
//		writer.write("파일쓰기 연습");
//		writer.close();
//	}
	
	public static void test(String str) {
		int number = Integer.parseInt(str);
		System.out.println("number -> " + number);
	}
	
	public static void main(String[] args) {
		
	}
}
