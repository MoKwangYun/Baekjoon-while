import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		System.out.println("str.charAt(2)�� ���� index 2 ���� �ϳ� ���:" +str.charAt(2));
		
		String str1 = scanner.next();
		String str2 =str.concat(str1);
		System.out.println("String str2 =str.concat(str1) ���� ���ڿ� ���̱� ���� �� str2:" + str2);
		
		StringBuffer ss = new StringBuffer("Java");
		
		ss.append(str1);
		System.out.println("StringBuffer Ŭ���� ss.append(str1) ��� ss = "+ ss);
		
	}
}
