package d006;

import java.util.Scanner;
import java.util.stream.Stream;

public class Application {

	private static class Unit {
		private final String _name;
		private final int _toMilliMeter;

		public Unit(String name, int toMilliMeter) {
			_name = name;
			_toMilliMeter = toMilliMeter;
		}

		public int toMilliMeter(int value) {
			return value * _toMilliMeter;
		}

		public String toName() {
			return _name;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try (Scanner scanner = new Scanner(System.in)) {
			String[] parameters = scanner.nextLine().split(" ");
			Unit[] units = { new Unit("km", 1000 * 1000), new Unit("cm", 10), new Unit("m", 1000) };

			Unit unit = Stream.of(units).filter(u -> u.toName().equals(parameters[1])).findAny().orElse(null);
			System.out.println(unit.toMilliMeter(Integer.parseInt(parameters[0])));
		}
	}

}
