public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int cash = 15_000;
        int capital = 0;
        int month = 0;
        while (capital < 2_459_000) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + capital + " рублей.");
            capital += cash;
            month++;
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

    }
}