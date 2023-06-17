import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Основной экран приложения */
        try (Scanner scanner = new Scanner(System.in)) {
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

            /* Сообщение пользователю */
            System.out.println("Enter the column to output:");
            /* Получение от пользователя столбца матрицы */
            int column = scanner.nextInt();
            /* Сообщение пользователю */
            System.out.println("Column of the first matrix: " + firstMatrix.getColumnMatrix(column));
            /* Сообщение пользователю */
            System.out.println("Column of the second matrix: " + secondMatrix.getColumnMatrix(column));

            /* Сообщение пользователю */
            System.out.println("Enter the row to output:");
            /* Получение от пользователя строки матрицы */
            int row = scanner.nextInt();
            /* Сообщение пользователю */
            System.out.println("Row of the first matrix: " + firstMatrix.getRowMatrix(row));
            /* Сообщение пользователю */
            System.out.println("Row of the second matrix: " + secondMatrix.getRowMatrix(row));

            /* Сообщение пользователю */
            System.out.println("The main diagonal of the first matrix: " + firstMatrix.getMainDiagonalMatrix());
            /* Сообщение пользователю */
            System.out.println("The main diagonal of the second matrix: " + secondMatrix.getMainDiagonalMatrix());

            /* Сообщение пользователю */
            System.out.println("The side diagonal of the first matrix: " + firstMatrix.getSideDiagonalMatrix());
            /* Сообщение пользователю */
            System.out.println("The side diagonal of the second matrix: " + secondMatrix.getSideDiagonalMatrix());
        } catch (Exception e) {
            /* Сообщение пользователю */
            System.out.println(e.getMessage());
        }
    }
}