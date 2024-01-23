import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Пользователь должен ввести свое первое число

        System.out.println("Введите первое число");
        float num1 = scanner.nextFloat();
g
        //Пользователь должен ввести свое второе число

        System.out.println("Введите второе число");
        float num2 = scanner.nextFloat();

        //Пользователь должен ввести операцию (+, -,*, /)

        System.out.println("Введите операцию");

        char operation = scanner.next().charAt(0);

        scanner.close();
        double out = 0.0;

        switch (operation) {
            case '+':
                out = num1 + num2;
                break;
            case '-':
                out = num1 - num2;
                break;
            case '*':
                out = num1 * num2;
                break;

            try {
                out = num1 / num2;
            } catch (ArithmeticException e) {
                System.out.println("на ноль делить нельзя.");
            }
            break;
            default:
                System.out.println("Неправильно введите ещё раз.");
        }
    }
    }


}

        System.out.println(num1 + " " + operation + " " + num2 + " = " + out);
    }

}