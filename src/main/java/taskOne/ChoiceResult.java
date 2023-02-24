package taskOne;

public class ChoiceResult {

    RealizationFunc firstRealization = new FirstRealization();
    RealizationFunc secondRealization = new SecondRealization();
    RealizationFunc thirdRealization = new ThirdRealization();

    void choiceResult(int value, int num) {
        switch (value) {
            case 1:
                firstRealization.function(num);
                break;
            case 2:
                secondRealization.function(num);
                break;
            case 3:
                thirdRealization.function(num);
                break;
            default:
                System.out.format("Неверные данные. Пожалуйста введите число от 1 до 3 включительно");
        }
    }
}
