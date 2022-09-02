package homework15;

public class InfixRunner {
    public static void main(String[] args) {
        String state = "A+B*(C*D-E)";
        System.out.println(state);
        System.out.println(InfixToPostFix.turnToPostFix(state));
        double result = InfixToPostFix.calculate(InfixToPostFix.turnToPostFix(state), 1, 2, 3, 4, 5);
        System.out.println(result);
        System.out.println(1 + 2 * (3 * 4 - 5));
    }

}
