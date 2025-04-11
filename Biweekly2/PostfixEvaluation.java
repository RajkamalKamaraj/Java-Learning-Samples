package Biweekly2;

import java.util.Stack;

class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        //String token = "0";
        for ( String token : expression.split("\\s+")) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            }
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            }
        }
        return stack.pop();
    }
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static int performOperation(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String postfixExpression1 = "2 3 +";
        String postfixExpression2 = "5 1 2 + 4 * + 3 -";
        String postfixExpression3 = "10 2 /";
        String postfixExpression4 = "100 20 3 - /";
        try {
            System.out.println(postfixExpression1 + " = " + evaluatePostfix(postfixExpression1));
            System.out.println(postfixExpression2 + " = " + evaluatePostfix(postfixExpression2));
            System.out.println(postfixExpression3 + " = " + evaluatePostfix(postfixExpression3));
            System.out.println(postfixExpression4 + " = " + evaluatePostfix(postfixExpression4));
        } catch (Exception e) {
            System.out.println("Error during evaluation: " + e.getMessage());
        }
    }
}
