package taskOne;

import java.util.stream.IntStream;

public class SecondRealization implements RealizationFunc {
    @Override
    public void function(int value) {
        value++;
        IntStream.range(1, value).forEach(result -> {
            System.out.printf(result % 15 == 0 ? "FooBar" + " "
                    : result % 3 == 0 ? "Foo" + " "
                    : result % 5 == 0 ? "Bar" + " "
                    : result + " ");
        });
    }
}


