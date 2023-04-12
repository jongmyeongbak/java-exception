package sample02;

public class ExceptionApp1 {

	/**
	 * 문자열을 전달받아 정수로 변환하여 반환한다.
	 * @param text 숫자로 구성된 문자열
	 * @return 정수값
	 */
	public static int toInt(String text) {
		int number = Integer.parseInt(text);
		return number;
	}
	
	public static void main(String[] args) {
		try {
			int value = toInt("1234가");
			System.out.println(value);
		} catch (NumberFormatException e) {
			String errorMessage = e.getMessage();
			System.out.println("오류 메시지: " + errorMessage);
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}
