package d003;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (Scanner scanner = new Scanner(System.in)) {
			int number = Integer.parseInt(scanner.nextLine());
			System.out.println(String.join(" ",
					IntStream.range(1, 10).mapToObj(n -> Integer.valueOf(n * number).toString()).toList()));
		}
	}

}
