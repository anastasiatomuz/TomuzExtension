public class Calculator {
    private double num1;
    private double num2;
    private String operType;

    public Calculator(double num1, double num2, String operType) {
        this.num1 = num1;
        this.num2 = num2;
        this.operType = operType;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        return num1 / num2;
    }

    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }

    public double mod(){
        return num1 % num2;
    }

    public double pow(){
        return Math.pow(num1, num2);
    }

    public double calculate(){
        if (operType.equals("*")){
            return multiply();
        } else if (operType.equals("/")){
            return divide();
        } else if (operType.equals("+")){
            return add();
        } else if (operType.equals("-")){
            return subtract();
        } else if (operType.equals("%")){
            return mod();
        } else {
            return pow();
        }
    }
}
