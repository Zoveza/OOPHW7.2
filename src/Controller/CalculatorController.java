package Controller;

import Model.Calculator;
import View.CalculatorInput;

public class CalculatorController {
    private CalculatorInput CalculatorInput;

    public CalculatorController(CalculatorInput calculatorInput) {
        this.CalculatorInput = calculatorInput;
    }

    public void realizeCalculate() {

        double newRealOne = CalculatorInput.getRealInput("FirstInput");
        double newImaginaryOne = CalculatorInput.getImaginaryInput("FirstInput");

        double newRealTwo = CalculatorInput.getRealInput("SecondInput");
        double newImaginaryTwo = CalculatorInput.getImaginaryInput("SecondInput");

        Calculator numberFirst = new Calculator(newRealOne, newImaginaryOne);
        Calculator numberSecond = new Calculator(newRealTwo, newImaginaryTwo);

        CalculatorInterface checkLogs = (CalculatorInterface) new CalculatorDecorator(numberFirst);

        int choice = CalculatorInput.getChoice();

        Calculator result;

        if (choice == 1) {
            result = checkLogs.additionNumbers(numberSecond);
            CalculatorInput.displayResult(" Результат сложения чисел: " + numberFirst +
                    " and " + numberSecond + " = " + result);
        } else if (choice == 2) {
            result = checkLogs.subtractNumbers(numberSecond);
            CalculatorInput.displayResult(" Результат вычитания чисел: " + numberFirst +
                    " minus " + numberSecond + " = " + result);
        } else if (choice == 3) {
            result = checkLogs.multiplyNumbers(numberSecond);
            CalculatorInput.displayResult(" Результат умножения чисел: " + numberFirst +
                    " and " + numberSecond + " = " + result);
        } else if (choice == 4) {
            result = checkLogs.divideNumbers(numberSecond);
            CalculatorInput.displayResult(" Результат деления чисел: " + numberFirst +
                    " divided by " + numberSecond + " = " + result);
        } else {
            CalculatorInput.displayResult(" Неверное значение. Попробуйте ещё раз! ");
        }
        CalculatorInput.closeScanner();
    }
}