package d004;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (Scanner scanner = new Scanner(System.in)) {
			int count = Integer.parseInt(scanner.nextLine());
			List<String> values = new ArrayList<String>();
			for (int i = 0; i < count; i++) {
				values.add(scanner.nextLine());
			}

			System.out.println(String.format("Hello %s", String.join(",", values)));
		}
	}

}
