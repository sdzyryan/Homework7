public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int cash = 15_000;
        int purpose = 2_459_000;
        int capital = 0;
        int month = 0;
        while (capital < purpose) {
            capital += cash;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + capital + " рублей.");
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

        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12_000_000;
        float birth = (float) 17 / 1000f;
        float death = (float) 8 / 1000f;

        for (int year = 1; year < 11; year ++) {
            population = (int) (population + (population*birth) - (population*death));
            System.out.printf("Год %d, численность населения составляет %d. %n", year, population);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int cash = 15_000; // ежемесячный взнос
        int totalCapital = 12_000_000; //цель накопить
        double percent = 0.07;
        int month = 1;

        while (cash <= totalCapital) {
            cash += cash * percent;
            System.out.printf("Месяц %d, накоплено %d. %n", month, cash);
            month++;
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int cash = 15_000; // ежемесячный взнос
        int totalCapital = 12_000_000; //цель накопить
        double percent = 0.07;
        int month = 1;

        while (cash <= totalCapital) {
            cash += cash * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, накоплено %d. %n", month, cash);
            }
            month++;
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int cash = 15_000; // ежемесячный взнос
        double percent = 0.07;
        int month = 1;
        int totalMonth = 12 * 9;

        while (month <= totalMonth) {
            cash += cash * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, накоплено %d. %n", month, cash);
            }
            month++;
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int friday = 7;
        while (friday <= 31) {
            System.out.println("Сегодня пятница " + friday + "-е число, нужно подготовить отчет.");
            friday = friday + 7;
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int nowYear = 2023;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int year = startYear;

        for (; year < finishYear; year++) {
            if (year % 79 ==0) {
                System.out.println(year);
            }
        }
    }

    public static void task9 () {
        System.out.println("Задача 8.1");

        int nowYear = 2023;
        int startYear = nowYear - 200;
        int finishYear = nowYear + 100;
        int year = 0;
        while (year < finishYear) {
                if (year > startYear) {
                System.out.println(year);
            }
            year = year + 79;
        }
    }

}