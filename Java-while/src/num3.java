import java.util.Scanner;

public class num3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int sum = a;
		int count = 0;
		while(true) {
			a = ((a%10)*10)+(((a/10) +(a%10)) %10);
			count++;
			
			if(sum == a)
				break;
		}
		
		System.out.println(count);
	}
}
