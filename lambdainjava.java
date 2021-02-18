public class lambdainjava {


    public static void main(String[] args) {

        lambdainjava lam = new lambdainjava();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;


        System.out.println("10 + 5 = " + lambdainjava.operate(10, 5, addition));
        System.out.println("10 - 5 = " + lambdainjava.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + lambdainjava.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + lambdainjava.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Nick");
        greetService2.sayMessage("Deters");

        //More Testing with lambda's
        MathOperation1 remainder = (int c, int d) -> c % d;

        System.out.println("50 % 9 = " + lambdainjava.operandi(50, 9, remainder ));

    }

    private static int operandi(int c, int d, MathOperation1 mathOperation1) {
        return mathOperation1.operandi(c, d);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface  MathOperation1 {
        int operandi(int c, int d);
    }
}
