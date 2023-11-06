package it.tcinet.igafarov;


public class JavaHomeWork {
    public static void main(String[] args) {
        arithmeticOperators();
        logicOperators();
        overflow();
        combinationIntAndDouble();
        ifElseOperator();
        switchCaseOperator();
        ternarOperator();
    }

    private static void arithmeticOperators() {

        int a = 10;
        int b = 4;
        int c = a - b;

        System.out.println("a + b= " + (a + b));
        System.out.println("a - b = " + c);
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("(a + b) * 2 - c= " + ((a + b) * b - c));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("\n");
    }

    private static void logicOperators() {
        int a = 10;
        int b = 4;
        int c = 6;

        System.out.println("a == b :" + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a + b >= c : " + ((a + b) <= c));
        System.out.println("\n");
    }

    private static void overflow() {
        byte b = Byte.MAX_VALUE;
        byte a = 2;

        System.out.println("Переполнение: " + (byte) (a * b));
        System.out.println("\n");
    }

    private static void combinationIntAndDouble() {

        double d = 1.52;
        int i = 2000;

        System.out.println("Приведение суммы (i + d) к int: " + (int) (i + d));
        System.out.println("Приведение разности (i - d) к double : " + (double) (i + d));
        System.out.println("\n");
    }

    private static void ifElseOperator() {
        int a = 1;
        int b = 2;
        int c = 1;

        if (a != b && b == c) {
            System.out.println("Условие 1 не выполнено");
        } else if (a == c && b <= a) {
            System.out.println("Условие 2 не выполнено");
        } else if (a >= c && (c + a) == b) {
            System.out.println("Условие 3 выполнено");
        } else {
            System.out.println("Нужно доработать");
        }
        System.out.println("\n");
    }

    private static void ternarOperator() {

        int age = 18;
        String answer = (age >= 18) ? "Можно управлять ТС" : "Нельзя управлять ТС по ПДД";
        System.out.println(answer);
        System.out.println("\n");
    }

    private static void switchCaseOperator() {
        String str = "Java";
        switch (str) {

            case "Python":
                System.out.println("Язык Python");
                break;
            case "С#":
                System.out.println("Язык С#");
                break;
            case "Java":
                System.out.println("Язык Java");
                break;
            default:
                System.out.println("язык программирования не найден");
        }
        System.out.println("\n");
    }
}