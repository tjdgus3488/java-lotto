package lotto;

import lotto.view.ExceptionMessage;

import java.util.HashSet;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        HashSet<Integer> integers = new HashSet<>(numbers);
        if (integers.size() != numbers.size()) {
            throw new IllegalArgumentException();
        }

    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    // TODO: 추가 기능 구현
}



//git 연결 확인