package racingcar;

import java.util.List;

public class RacingCarGame {
    private int moveNumber;
    private List<Car> carList;
    private final User user = new User();

    public void start() {
        carList = user.getCarNames();
        moveNumber = user.getMoveNumber();
        for (int i = 0; i < moveNumber; i++) {
            moveCars();
        }
        printFinishCarNames();
    }

    public void moveCars() {
        for (Car car : carList){
            car.move();
        }
    }

    public void printFinishCarNames() {}
}
