import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Экземляр класса Scanner */
        Scanner scanner = new Scanner(System.in);

        /* Основной экран приложения */
        try {
            /* Сообщение пользователю */
            System.out.println("Enter the size of the matrices:");
            /* Получение от пользователя размера матриц */
            int size = scanner.nextInt();

            /* Экземпляр класса Matrix - первая матрица */
            Matrix firstMatrix = new Matrix(size);
            /* Экземпляр класса Matrix - вторая матрица */
            Matrix secondMatrix = new Matrix(size);

            /* Сообщение пользователю */
            System.out.println("First matrix:\n" + firstMatrix.getMatrix());
            /* Сообщение пользователю */
            System.out.println("Second matrix:\n" + secondMatrix.getMatrix());

        } catch (Exception e) {
            /* Сообщение пользователю */
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}