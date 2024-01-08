package consoleapp;

import consoleapp.option.BooleanOption;
import consoleapp.option.EnumOption;
import consoleapp.option.IntegerOption;
import consoleapp.option.Option;
import consoleapp.processor.DefaultOptionProcessor;

import java.util.Set;

public class Calculator {
    public static void main(String[] args) {
        DefaultOptionProcessor optionProcessor = new DefaultOptionProcessor();

        Option<Integer> leftOperandOption = new IntegerOption("l", "Left operand", Set.of("-l"));
        Option<Integer> rightOperandOption = new IntegerOption("r", "Right operand", Set.of("-r"));
        Option<Operator> operatorOption = new EnumOption<>("o", "Operator", Set.of("-o"), Set.of(Operator.PLUS, Operator.MINUS, Operator.MULTIPLY, Operator.DIVIDE));
        Option<Boolean> verboseOption = new BooleanOption("v", "Verbose", Set.of("-v"));

        optionProcessor.addOption("leftOperand", leftOperandOption);
        optionProcessor.addOption("rightOperand", rightOperandOption);
        optionProcessor.addOption("operator", operatorOption);
        optionProcessor.addOption("verbose", verboseOption);

        // Process command line arguments and set option values
        optionProcessor.processOptions(args);

        int leftOperand = leftOperandOption.getValue();
        int rightOperand = rightOperandOption.getValue();
        Operator operator = operatorOption.getValue();
        boolean verbose = verboseOption.getValue();

        int result = calculate(leftOperand, rightOperand, operator);

        if (verbose) {
            System.out.println(leftOperand + " " + operator + " " + rightOperand + " = " + result);
        } else {
            System.out.println(result);
        }
    }

    private static int calculate(int leftOperand, int rightOperand, Operator operator) {
        switch (operator) {
            case PLUS:
                return leftOperand + rightOperand;
            case MINUS:
                return leftOperand - rightOperand;
            case MULTIPLY:
                return leftOperand * rightOperand;
            case DIVIDE:
                if (rightOperand != 0) {
                    return leftOperand / rightOperand;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
            default:
                throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private enum Operator {
        PLUS, MINUS, MULTIPLY, DIVIDE
    }
}