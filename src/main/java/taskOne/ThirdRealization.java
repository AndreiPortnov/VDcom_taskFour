package taskOne;

import java.util.Arrays;

public class ThirdRealization implements RealizationFunc {
    int[] numbers;

    @Override
    public void function(int value) {

        numbers = new int[value];

        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i;
        }

        Arrays.stream(numbers)
                .mapToObj(v -> v % 3 == 0 ? getFoo(v) : getBar(v))
                .forEach(System.out::println);

    }

    String getFoo(int value) {
        return value % 5 == 0 ? "FooBar" : "Foo";
    }

    String getBar(int value) {
        return value % 5 == 0 ? "Bar" : String.valueOf(value);
    }
}
