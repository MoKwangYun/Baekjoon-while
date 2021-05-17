import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		System.out.println("str.charAt(2)를 통해 index 2 문자 하나 출력:" +str.charAt(2));
		
		String str1 = scanner.next();
		String str2 =str.concat(str1);
		System.out.println("String str2 =str.concat(str1) 통해 문자열 붙이기 연산 후 str2:" + str2);
		
		StringBuffer ss = new StringBuffer("Java");
		
		ss.append(str1);
		System.out.println("StringBuffer 클래스 ss.append(str1) 결과 ss = "+ ss);
		
	}
}
