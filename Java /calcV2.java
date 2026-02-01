import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* EXERCISE 2a: Easy Calculator (Now with Methods)
         *
         * Use the same Calculator, we've made in Exercise 1a and remake it with methods!
         * In addition, make it so that the calculator asks if you'd like to continue, you can then say "y" if you do!
         * Think how this "infinite" loop could be made! (Hint: Lesson Loops)
         *
         * Estimated Time: 30-45 minutes
         *
         */

        /* SOLUTION EXERCISE 1a */
       int i = 0;
       while(i < 1) {

           Scanner scanner = new Scanner(System.in);


           System.out.println("Type in the operation (plus or +, minus or -, multiply or *, divide or /)");
           String operation = scanner.next();

           System.out.println("Type in your first number!");
           int number1 = scanner.nextInt();

           System.out.println("Type in your second number!");
           int number2 = scanner.nextInt();
           int result = 0;

           switch (operation) {
               case "plus", "+":
                   Plus(number1, number2);
                   break;
               case "minus", "-":
                   Minus(number1, number2);
                   break;
               case "multiply", "*":
                   Multiply(number1, number2);
                   break;
               case "divide", "/":
                   Divide(number1, number2);
                   break;
               default:
                   result = 0;
                   break;
           }


           System.out.println("Continue?");
           String Yes = "Y";
           String No = "N";
           String Answer = scanner.next();
           if (Answer.equals(Yes)) {
               System.out.println("Yippppiiieeeee :D");
           } else if (Answer.equals(No)) {
               System.out.println("Aww Man :(");
               i++;
           }

           System.out.println("Your result is " + number1 + " " + operation + " " + number2 + " = " + result);
       }
    }
    public static void Plus(int one, int two){
        int output = one + two;
        System.out.println("answer: " + output);
    }
    public static void Minus(int one, int two){
        int output = one - two;
        System.out.println("answer: " + output);
    }
    public static void Multiply(int one, int two){
        int output = one * two;
        System.out.println("answer: " + output);
    }
    public static void Divide(int one, int two){
        int output = one / two;
        System.out.println("answer: " + output);
    }


}
