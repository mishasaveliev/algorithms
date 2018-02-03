import java.util.Stack;

public class ExpressionSolver {

    public static double solve(String expression){
        String[] expParts = split(expression);
        Stack<Double> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();
        for(int i =0; i < expression.length(); i ++){
            String part = expParts[i];
            if(part.equals("+") || part.equals("*")) {
                operators.push(part);
            }
            else if(part.matches("[0-9]")){
                ;
                numbers.push(Double.parseDouble(part));
            }
            else if(part.equals(")")){
                double left = numbers.pop();
                double right = numbers.pop();
                String operator = operators.pop();
                if (operator.equals("+")){
                    numbers.push(left + right);
                }
                else if (operator.equals("*")){
                    numbers.push(left*right);
                }
            }
        }
        while(!operators.empty()){
            double left = numbers.pop();
            double right = numbers.pop();
            String operator = operators.pop();
            if (operator.equals("+")){
                numbers.push(left + right);
            }
            else if (operator.equals("*")){
                numbers.push(left*right);
            }
        }


        return numbers.pop();
    }
    public static String[] split(String s){
        String[] splitStrings = s.split("");
        return splitStrings;
    }


}
