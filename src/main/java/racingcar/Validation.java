package racingcar;

import static racingcar.constants.BoundaryValues.*;

public class Validation {
    public static void checkCarNameInput(String Input){
        String userInput = Input.trim();
        checkEmpty(userInput);
        checkFirstComma(userInput, userInput.length() - 1);
        checkLastComma(userInput);
        checkConsecutiveCommas(userInput);
    }

    public static void checkEmpty(String userInput){
        if (userInput.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름을 입력해주세요.");
        }
    }

    public static void checkFirstComma(String userInput, int lastIndex) {
        if (userInput.charAt(lastIndex) == ',') {
            throw new IllegalArgumentException("쉼표(,)로 끝납니다.");
        }
    }

    public static void checkLastComma(String userInput) {
        if (userInput.charAt(0) == ',') {
            throw new IllegalArgumentException("쉼표(,)로 시작합니다.");
        }
    }

    public static void checkConsecutiveCommas(String userInput) {
        if (userInput.contains(",,") || userInput.contains(", ,")) {
            throw new IllegalArgumentException("쉼표(,)가 연속으로 입력되었습니다.");
        }
    }

    public static void checkMaxNameLength(String carName) {
        if (carName.length() > maxCarNameLength) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }

    public static void checkNameIsEmpty(String carName) {
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름은 1자 이상만 가능합니다.");
        }
    }

    public static void validateRound(String round){
        if (round.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

}
