package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static racingcar.Constant.*;
public class Validation {

    public static List<String> validateCarNames(String cars){
        List<String> carsStingList = validateDivision(cars);
        for (String carName : carsStingList){
            validateLength(carName);
        }
        return carsStingList;
    }
    private static List<String> validateDivision(String cars){
        List<String> carsStingList = new ArrayList<>();
        String[] carInputList = cars.split(",");
        carsStingList.addAll(Arrays.asList(carInputList));
        return carsStingList;
    }

    private static void validateLength(String carName){
        if (carName.length() > CAR_NAME_MAX_SIZE || carName.isEmpty()){
            throw new IllegalArgumentException();
        }
    }
}
