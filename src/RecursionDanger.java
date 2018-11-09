import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionDanger {
    private static int[] createArray(Scanner scanner) {
        System.out.println("введите длину");
        int length = scanner.nextInt();
        int[] array = new int[length];
        if (length == 0 || length > 10) {
            System.out.println("длина массива должна быть от 0 до 10");
            array=createArray(scanner);

        }
        System.out.println("последний элемиент массива =" + array[length - 1]);
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        createArray(scanner);
//        getUserInputNoRecursion(scanner, 1, 5);
////        RecursionDanger.getUserInput(1,5); вызов метода
//    }
//
////    public static int getUserInput(Scanner sc, int min, int max) {
////        System.out.println("введите число от " + min + "до" + max);
////        int result;
////        try {
////            result = sc.nextInt();
////
////        } catch (InputMismatchException e) {
////            System.out.println("ввели не число");
////            return getUserInput(sc, min, max);
////
////        }
////        if (result < min || result > max) {
////            System.out.printf("вы ввели не от %d до %d \n", min, max);
////            return getUserInput(sc, min, max);
////        }
////        return result;
////    }
//public static int getUserInputNoRecursion(Scanner scanner, int min, int max) {
//    System.out.println("enter number from " + min + " to " + max);
//    int result;
//    while (true) {
//        try {
//            result = scanner.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("not a number");
//            continue;
//        }
//        if (result < min || result > max) {
//            System.out.println("number not from " + min + " to " + max);
//            continue;
//        }
//        return result;
//    }
//}
    }
}
