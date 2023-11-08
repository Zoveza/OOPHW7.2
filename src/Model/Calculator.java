package Model;

public class Calculator {

    public double numberReal;
    public double numberImaginaryPart;

    public Calculator(double numberReal, double numberImaginaryPart) {
        this.numberReal = numberReal;
        this.numberImaginaryPart = numberImaginaryPart;
    }


    public Calculator additionNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal + numberNew.numberReal,
                this.numberImaginaryPart + numberNew.numberImaginaryPart);
    }


    public Calculator subtractNumbers(Calculator numberNew) {
        return new Calculator(this.numberReal - numberNew.numberReal,
                this.numberImaginaryPart - numberNew.numberImaginaryPart);
    }


    public Calculator multiplyNumbers(Calculator numberNew) {
        double realContainer = (this.numberReal * numberNew.numberReal) -
                (this.numberImaginaryPart * numberNew.numberImaginaryPart);
        double imaginaryContainer = (this.numberReal * numberNew.numberImaginaryPart) +
                (this.numberImaginaryPart * numberNew.numberReal);
        return new Calculator(realContainer, imaginaryContainer);
    }


    public Calculator divideNumbers(Calculator numberNew) {
        double realPart = ((this.numberReal * numberNew.numberReal) +
                (this.numberImaginaryPart * numberNew.numberImaginaryPart)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginaryPart * numberNew.numberImaginaryPart));
        double imaginaryPart = ((this.numberImaginaryPart * numberNew.numberReal) -
                (this.numberReal * numberNew.numberImaginaryPart)) /
                ((numberNew.numberReal * numberNew.numberReal) +
                        (numberNew.numberImaginaryPart * numberNew.numberImaginaryPart));
        return new Calculator(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        if (numberImaginaryPart >= 0) {
            return numberReal + " + " + numberImaginaryPart + "i";
        } else {
            return numberReal + " - " + Math.abs(numberImaginaryPart) + "i";
        }
    }

}