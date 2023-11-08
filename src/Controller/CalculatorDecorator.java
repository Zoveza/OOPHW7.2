package Controller;

import Model.Calculator;

public class CalculatorDecorator implements CalculatorInterface {
    protected  Calculator calculator;

    public CalculatorDecorator(Calculator calculator) {
        this.calculator = calculator;
    }


    @Override
    public Calculator additionNumbers(Calculator numberNew) {
        Calculator result = calculator.additionNumbers(numberNew);
        System.out.println("Журнал операций сложения:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    @Override
    public Calculator subtractNumbers(Calculator numberNew) {
        Calculator result = calculator.subtractNumbers(numberNew);
        System.out.println("Журнал операций вычитания:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    @Override
    public Calculator multiplyNumbers(Calculator numberNew) {
        Calculator result = calculator.multiplyNumbers(numberNew);
        System.out.println("Журнал операций умножения:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }

    @Override
    public Calculator divideNumbers(Calculator numberNew) {
        Calculator result = calculator.divideNumbers(numberNew);
        System.out.println("Журнал операций деления:" + calculator + " ->" + numberNew + " = "+ result);
        return result;
    }
    @Override
    public String toString() {
        return calculator.toString();
    }
}