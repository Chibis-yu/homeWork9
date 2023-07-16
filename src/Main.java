import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] oneArr = new int[]{1, 2, 3};
        double[] twoArr = {1.57, 7.654, 9.986};
        char[] threeArr = {'b', 'r', 'p' };
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] oneArr = {1, 2, 3};
        double[] twoArr = {1.57, 7.654, 9.986};
        char[] threeArr = {'b', 'r', 'p' };


        for (int i = 0; i < oneArr.length; i = i + 1) {
            System.out.print(oneArr[i]);

            if (i != oneArr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < twoArr.length; i++) {
            System.out.print(twoArr[i]);

            if (i != twoArr.length - 1) {
                System.out.print(", ");
            }
        }


        System.out.println();

        for (int i = 0; i < threeArr.length; i++) {
            System.out.print(threeArr[i]);

            if (i != threeArr.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задание 3");

        int[] oneArr = {1, 2, 3};
        double[] twoArr = {1.57, 7.654, 9.986};
        char[] threeArr = {'b', 'r', 'p' };

        for (int i = oneArr.length - 1; i >= 0; i--) {
            System.out.print(oneArr[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = twoArr.length - 1; i >= 0; i = i - 1) {
            System.out.print(twoArr[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = threeArr.length - 1; i >= 0; i--) {
            System.out.print(threeArr[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задание 4");

        int[] oneArr = {1, 2, 3};
        for (int i = 0; i < oneArr.length; i = i + 1) {
            if (oneArr[i] % 2 != 0) {
                oneArr[i]++;
            }
        }
        System.out.println(oneArr);
        System.out.println(Arrays.toString(oneArr));
    }
}


