package taskOne;

public class FirstRealization implements RealizationFunc {
    @Override
    public void function(int value) {

        for (int i = 1; i <= value; i++) {
            if (i % 15 == 0)
                System.out.printf("FooBar");
            else if (i % 3 == 0)
                System.out.printf("Foo");
            else if (i % 5 == 0)
                System.out.printf("Bar");
            else
                System.out.printf("%d", i);

            System.out.printf(" ");
        }
    }
}

