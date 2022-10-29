import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        String operationType;
        int locOperation = 0;
        String operType;
        double num1;
        double num2;

        if (expression.contains("*")){
            locOperation = expression.indexOf("*");
            operType = "*";
        } else if (expression.contains("/")){
            locOperation = expression.indexOf("/");
            operType = "/";
        } else if (expression.contains("+")){
            locOperation = expression.indexOf("+");
            operType = "+";
        } else if (expression.contains("-")){
            locOperation = expression.indexOf("-");
            operType = "-";
        } else if (expression.contains("%")){
            locOperation = expression.indexOf("%");
            operType = "%";
        } else if (expression.contains("^")){
            locOperation = expression.indexOf("^");
            operType = "^";
        } else {
            System.out.println("invalid expression entered");
            operType = "";
        }

        //parsing
        String firstNumStr = expression.substring(0, locOperation);
        String secondNumStr = expression.substring(locOperation + 1);
        firstNumStr = firstNumStr.replaceAll("\\s", "");
        secondNumStr = secondNumStr.replaceAll("\\s", "");
        double firstNum = Double.parseDouble(firstNumStr);
        double secondNum = Double.parseDouble(secondNumStr);

        //create Calculator object and calculate the expression
        Calculator cal = new Calculator(firstNum, secondNum, operType);
        System.out.println("Result: " + cal.calculate());
    }
}