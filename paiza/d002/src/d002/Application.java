package d002;

import java.util.Scanner;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int left = numbers[0];
			int right = numbers[1];
			if (left == right) {
				System.out.println("eq");
				return;
			}

			System.out.println(Math.max(left, right));
		}
	}

}
