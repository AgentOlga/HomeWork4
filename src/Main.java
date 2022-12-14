public class Main {
    public static void main(String[] args) {

        task1();
        // С помощью цикла for выведите в консоль все числа от 1 до 10.
        task2();
        // С помощью цикла for выведите в консоль все числа от 10 до 1.
        task3();
        // Выведите в консоль все четные числа от 0 до 17.
        task4();
        // Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        task5();
        // Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096. В консоль результат должен выводиться в формате: «… год является високосным».
        task6();
        // Напишите программу, которая выводит в консоль последовательность чисел:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        task7();
        // Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        task8();
        // Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        task9();
        // Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        task10();
        //  Напишите программу, которая выводит в консоль таблицу умножения на 2.
    }



    public static void task1() {
        System.out.println("task1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task2() {
        System.out.println("task2");
        for(int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task3() {
        System.out.println("task3");
        for (int i = 0; i <=17; i = i + 2)  {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task4() {
        System.out.println("task4");
        for ( int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }

    public static void task5() {
        System.out.println("task5");
        for( int i = 1904; i <= 2096; i = i + 4) {
            System.out.println( i + " год является високосным.");
        }
    }

    public static void task6() {
        System.out.println("task6");
        for ( int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("task7");
        for ( int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("task8");
        int sum = 0;
        for ( int i = 1; i <= 12; i++) {
            sum = sum + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum +" рублей.");
        }
    }

    public static void task9() {
        System.out.println("task9");
        int monthSum = 29000;
        double depositInterest = 0.01;
        int sum = 0;
        for ( int i = 1; i <= 12; i++) {
            sum += monthSum + sum * depositInterest;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum +" рублей.");
        }
    }

    public static void task10() {
        System.out.println("task10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i*2);
        }

    }
}