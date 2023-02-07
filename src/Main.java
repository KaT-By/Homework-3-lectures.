public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstTask(); // Первое задание
        SecondtTask(); // Второе задание
        ThirdTask(); // Третье задание
        FourthTask(); // Четвертое задание
        FifthTask(); // Пятое задание
        SixthTask(); // Шестое задание
        SeventhTask(); // Седьмое задание
    }


    static void FirstTask() {
        int Number = 100;
        if (Number <= 9) {
            System.out.println();
            System.out.println("Наше число однозначное");
        } else if (Number <= 99) {
            System.out.println();
            System.out.println("Наше число двухзначное");
        } else if (Number <= 100) {
            System.out.println();
            System.out.println("Наше число трехзначное");
        } else if (Number >= 1000) {
            System.out.println();
            System.out.println("Наше число больше трех значного");
        }

    }

    static void SecondtTask() {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a + b > c || a + c > b || c + b > a) {
            System.out.println();
            System.out.println("Наш треугольник существует");
        } else {
            System.out.println();
            System.out.println("Нашего треугольника не существует");
        }
    }

    static void ThirdTask() {
        int a = 0;
        if (a <= -1) {
            System.out.println();
            System.out.println(2 - a);
        } else if (a >= 1) {
            System.out.println();
            System.out.println(1 + a);
        } else if (a == 0) {
            System.out.println();
            System.out.println(10 + a);
        }
    }

    static void FourthTask() {
        // Здесь я проверяю каждое число, а затем меняю значение переменной на 1 или 0 для будующего сложения.
        // Также и в 5 задании задействована такая же логика
        int a = 89;
        int b = 0;
        int c = -1;
        int d = 1; // Число для присваивания и сложения в будущем
        int e = 0; // Число для присваивания и сложения в будущем
        if (a >= 1) {
            a = d;
        } else {
            a = e;
        }
        if (b >= 1) {
            b = d;
        } else {
            b = e;
        }
        if (c >= 1) {
            c = d;
        } else {
            c = e;
        }
        if (a + b + c == 3) {
            System.out.println();
            System.out.println("У нас три положительных числа");
        } else if (a + b + c == 2) {
            System.out.println();
            System.out.println("У нас два положительных числа");
        } else if (a + b + c == 1) {
            System.out.println();
            System.out.println("У нас одно положительное число");
        } else if (a + b + c == 0) {
            System.out.println();
            System.out.println("У нас нет положительных чисел");
        }
    }

    static void FifthTask() {
        int a = 89;
        int b = 0;
        int c = 1;
        int d = 1; // Число для присваивания
        int e = 0; // Число для присваивания
        if (a >= 1) {
            a = d;
        } else {
            a = e;
        }
        if (b >= 1) {
            b = d;
        } else {
            b = e;
        }
        if (c >= 1) {
            c = d;
        } else {
            c = e;
        }
        if (a + b + c == 3) {
            System.out.println();
            System.out.println("У нас три положительных числа");
            System.out.println("У нас нет отрицательных чисел");
        } else if (a + b + c == 2) {
            System.out.println();
            System.out.println("У нас два положительных числа");
            System.out.println("У нас одно отрицательное число");
        } else if (a + b + c == 1) {
            System.out.println();
            System.out.println("У нас одно положительное число");
            System.out.println("У нас два отрицательных чисела");
        } else if (a + b + c < 0) {
            System.out.println();
            System.out.println("У нас нет положительных чисел");
            System.out.println("У нас три отрицательных чисела");
        }
    }

    static void SixthTask() {
        int a = 3;
        int b = 29;
        if (a > b) {
            System.out.println();
            System.out.println("Первое число больше " +  a);
        } else {
            System.out.println();
            System.out.println("Второе число больше " +  b);
        }
    }

    static void SeventhTask() {
        // Тут я использую switch из-за того что он немного короче а return для того чтобы остановить case.
        int a = 4;
        switch (a) {
            case 1:
                System.out.println();
                System.out.println("У нас 1 программист");
                return;
            case 2:
                System.out.println();
                System.out.println("У нас 2 программиста");
                return;
            case 3:
                System.out.println();
                System.out.println("У нас 3 программиста");
                return;
            case 4:
                System.out.println();
                System.out.println("У нас 4 программиста");
                return;
            case 5:
                System.out.println();
                System.out.println("У нас 5 программистов");
                return;
            case 6:
                System.out.println();
                System.out.println("У нас 6 программистов");
                return;
            case 7:
                System.out.println();
                System.out.println("У нас 7 программистов");
                return;
            case 8:
                System.out.println();
                System.out.println("У нас 8 программистов");
                return;
            case 9:
                System.out.println();
                System.out.println("У нас 9 программистов");
                return;
            case 10:
                System.out.println();
                System.out.println("У нас 10 программистов");
                return;
            default:
                System.out.println();
                System.out.println("У нас больше 10 программистов");
        }
    }
}