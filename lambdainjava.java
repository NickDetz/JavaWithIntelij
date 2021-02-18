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
        MathOperation1 remainder = (double c, double d) -> c % d;

        MathOperation1 divisions = (double c, double d) -> d/c;

        System.out.println("50 % 9 = " + lambdainjava.operandi(50, 9, remainder ));
        System.out.println("9 / 50 = " + lambdainjava.operandi(50, 9, divisions));
        System.out.println("");

        TalkingMachine talkingMach = (talking) ->
                System.out.println(talking);

        talkingMach.Talk("Hi how  are you");


    }

    private static double operandi(double c, double d, MathOperation1 mathOperation1) {
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
        double operandi(double c, double d);
    }

    interface TalkingMachine {
        void Talk(String talking);
    }


}
