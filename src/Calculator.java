import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        String operationType;
        int locOperation = 0;
        double num1;
        double num2;

        if (expression.contains("*")){
            locOperation = expression.indexOf("*");
        } else if (expression.contains("/")){
            locOperation = expression.indexOf("/");
        } else if (expression.contains("+")){
            locOperation = expression.indexOf("+");
        } else if (expression.contains("-")){
            locOperation = expression.indexOf("-");
        } else if (expression.contains("%")){
            locOperation = expression.indexOf("%");
        } else if (expression.contains("^")){
            locOperation = expression.indexOf("^");
        } else {
            System.out.println("invalid expression entered");
        }

        //parsing

        String firstNumStr = expression.substring(0,locOperation);
        String secondNumStr = expression.substring(locOperation + 1);
        firstNumStr = firstNumStr.replaceAll("\\s", "");
        secondNumStr = secondNumStr.replaceAll("\\s", "");
        double firstNum = Double.parseDouble(firstNumStr);
        double secondNum = Double.parseDouble(secondNumStr);







    }
}
