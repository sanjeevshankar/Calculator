package utils;

import java.util.Scanner;

public class CalculatorImplementation implements CalculatorRequest
{
    private int value1;
    private int value2;
    private String operation;
    private int result;
    private double sqrtResult;
    private int printResult;

    @Override
    public int result() {
        if (operation.equalsIgnoreCase("+")){
        result = Math.addExact(value1,value2);}
        else if (operation.equalsIgnoreCase("-")){
            result = Math.subtractExact(value1,value2);}
        else if (operation.equalsIgnoreCase("/"))
            result = Math.divideExact(value1,value2);
        else if (operation.equalsIgnoreCase("*")){
            result = Math.multiplyExact(value1, value2);
        }
          return result;
    }

    @Override
    public int getFirstNumber() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the first value?");
        value1 = Integer.parseInt(myObj.nextLine());
        return value1;
    }

    @Override
    public int getSecondNumber() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is the second value?");
        value2 = Integer.parseInt(myObj.nextLine());
        return value2;
    }

    @Override
    public String getOperation() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What operation would you like to perform? Choose from + (add), - (subtract), / (divide), * (mulitply), ^ (exponents and roots).");
        operation =  myObj.nextLine();
        System.out.println("You want to perform the operation \t" + operation + ".");
        System.out.println(" ");

        return operation;
    }

    @Override
    public double getSquareRoot(){
            sqrtResult = Math.sqrt(value1);
            return sqrtResult;
    }

    @Override
    public void printResult(){
        System.out.println("Your result is \t" + result);

    }


}
