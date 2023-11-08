package Controller;

import Model.Calculator;

public interface CalculatorInterface {
    Calculator additionNumbers(Calculator numberNew);

    Calculator subtractNumbers(Calculator numberNew);

    Calculator multiplyNumbers(Calculator numberNew);

    Calculator divideNumbers(Calculator numberNew);

    String toString();
}
