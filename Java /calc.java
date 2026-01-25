import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Provide the operation of choise 1=+ 2=- 3=* 4=/ ");
        Scanner scanner = new Scanner(System.in);
        int studentId = scanner.nextInt();
        switch(studentId) {
            case 1:
                System.out.println("what first number would you like?");
                int firstadd = scanner.nextInt();
                System.out.println("what second number would you like?");
                int secondadd = scanner.nextInt();
                int Addition = firstadd + secondadd;
                System.out.println("Answer:" + Addition);
                break;
            case 2:
                System.out.println("what first number would you like?");
                int firstsub = scanner.nextInt();
                System.out.println("what second number would you like?");
                int secondsub = scanner.nextInt();
                int Subtracktion = firstsub - secondsub;
                System.out.println("Answer:" + Subtracktion);
                break;
            case 3:
                System.out.println("what first number would you like?");
                int firstmulti = scanner.nextInt();
                System.out.println("what second number would you like?");
                int secondmulti = scanner.nextInt();
                int Multiplication = firstmulti * secondmulti;
                System.out.println("Answer:" + Multiplication);
                break;
            case 4:
                System.out.println("what first number would you like?");
                int firstdiv = scanner.nextInt();
                System.out.println("what second number would you like?");
                int seconddiv = scanner.nextInt();
                int Divition = firstdiv / seconddiv;

                    if (Divition == 0) {
                        double doublediv1 = firstdiv;
                        double doublediv2 = seconddiv;
                        double Doublediv = doublediv1 / doublediv2;
                        System.out.println("Answer: " + Doublediv);
                    } else {
                        System.out.println("Answer: " + Divition);
                    }
                break;
            default:
                System.out.println("ERROR: Incorrect Input");
                break;
        }
    }
}
