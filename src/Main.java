import java.util.Random;

public class Main {
    int[] arr = new int[30];
    static int count = 0;
    static int a = 0;

    public static <string> void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            a = arr[i];
            count += a;
        }
        System.out.println("Сумма трат за месяц " + count + " рублей");
        //Задание 2
        System.out.println("Задание 2");
        int max = 0;
        int min = 200000;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            a = arr[i];
            min=a;
            if (min > a) {
                min = a;
            }
            if (max < a) {
                max = a;
            }
        }
        System.out.println("Максимальная трата за день " + max + " рублей. Минимальная трата за день " + min + " рублей");
        //Задание 3
        System.out.println("Задание 3");
        count=0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_000;
            a = arr[i];
            count += a;
        }
        count=count/30;
        System.out.println("Средняя сумма трат за месяц составила "+count+" рублей");
        //Задание 4
        System.out.println("Задание 4");
        char[] y = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int e=10;

        for (e=10; e>=0; e--){
            System.out.print(y[e]);
        }
    }
}