import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		int count = 0;
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			Article a = new Article();
			System.out.println("Enter line " + (i + 1));
			a.setLine(sc.nextLine());
			a.start();
			a.join();
			count += a.getCount();
		}
		System.out.println("There are " + count + " articles in the given input");
	}
}