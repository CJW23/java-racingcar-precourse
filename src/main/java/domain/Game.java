package domain;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	private ArrayList<Car> carList;
	private Scanner scan;
	private int tryGame;

	public Game() {
		carList = new ArrayList<Car>();
		scan = new Scanner(System.in);

		requestCarName();
		requestTryGame();
	}

	private void requestTryGame() {
		System.out.println("시도할 회수는 몇회인가요?");
		tryGame = scan.nextInt();
	}

	private void requestCarName() {
		String carName;
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
		carName = scan.nextLine();

		divideCarName(carName);
	}

	private void divideCarName(String cars) {
		StringTokenizer carsToken = new StringTokenizer(cars);

		for (int i = 1; carsToken.hasMoreTokens(); i++) {
			carList.add(new Car(carsToken.nextToken(",")));
			System.out.println(carList.get(carList.size() - 1).getName());
		}
	}
}
