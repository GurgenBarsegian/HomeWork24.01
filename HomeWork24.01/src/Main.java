import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пользователь введи два числа:");
        double doubleBox1 = scanner.nextDouble();
        double doubleBox2 = scanner.nextDouble();

        double finalAddResult = addition(doubleBox1, doubleBox2);
        System.out.println("Ваш результат сложения: " + finalAddResult);

        double finalResultOfSub = subtraction(doubleBox1, doubleBox2);
        System.out.println("Ваш результат вычитания: " + finalResultOfSub);

        double finalResultOfMulti = multiplication(doubleBox1, doubleBox2);
        System.out.println("Ваш результат умножения: " + finalResultOfMulti);

        double finalResultOfDivide = divide(doubleBox1, doubleBox2);
        System.out.println("Ваш результат деления: " + finalResultOfDivide);

        double finalResultOfPercent = percent(doubleBox1, doubleBox2);
        System.out.println("Ваш результат деления с остатком: " + finalResultOfPercent);

        System.out.println("Введите любое число, оно будет взведено в квадрат: ");
        double Box = scanner.nextDouble();
        double finalResultOfSquaring = squaring(Box);
        System.out.println("Результат взведения числа в квадрат: " + finalResultOfSquaring);



    }
    public static double addition(Double Box1, Double Box2){
        double addResultBox = Box1+Box2;
        return addResultBox;

    }
    public static double subtraction(Double Box1, Double Box2){
        double subResultBox = Box1-Box2;
        return subResultBox;

    }
    public static double multiplication(Double Box1, Double Box2){
        double resultOfMultiBox = Box1 *Box2;
        return resultOfMultiBox;
    }
    public static double divide(Double Box1, Double Box2){
        double resultOfDivideBox = Box1/Box2;
        return resultOfDivideBox;
    }
    public static double percent(Double Box1, Double Box2){
        double resultOfPercentBox = Box1%Box2;
        return resultOfPercentBox;
    }
    public static double squaring(Double Box){
        double resultOfSquaringBox = Box*Box;
        return resultOfSquaringBox;

    }

}