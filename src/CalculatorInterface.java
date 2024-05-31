import utils.CalculatorImplementation;

public class CalculatorInterface {
    public static void main(String[] args){
        CalculatorImplementation calculatorImplementation = new CalculatorImplementation();

        calculatorImplementation.getFirstNumber();
        calculatorImplementation.getSecondNumber();
        calculatorImplementation.getOperation();
        calculatorImplementation.result();
        calculatorImplementation.printResult();

    }
}