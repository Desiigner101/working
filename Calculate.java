public class Calculate extends SimpleCalculator{
    
    private char operator;

    public Calculate(float num1, float num2, char operator){
        super(num1, num2);
        this.operator = operator;
    }

    public void setOperator(char operator){
        this.operator = operator;
    }

    public char getOperator(){
        return operator;
    }

    public float calculateResult(){
        float num1 = getNumber1();
        float num2 = getNumber2();
        switch(operator){
            case '+':
            return  num1 + num2;
            case '-':
            return num1 - num2;
            case '*':
            return num1 * num2;
            case '/':
            if(num2 != 0){
                return (float) num1 / num2;
            }else{
                throw new ArithmeticException("Division of zero is not allowed.");
            }
            default:
            throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
