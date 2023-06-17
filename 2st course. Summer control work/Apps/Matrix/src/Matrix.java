import java.util.Arrays;
import java.util.Random;

public class Matrix {
    /* Матрица */
    private final int[][] matrix;

    /* Экземляр класса Random */
    Random random = new Random();

    /* Конструктор класса Matrix */
    public Matrix(int size) {
        this.matrix = new int[size][size];
        generating();
    }

    /* Заполнение матрицы случайными числами */
    private void generating() {
        /* Прохождение по строкам матрицы */
        for (int i = 0; i < matrix.length; i++) {
            /* Прохождение по столбцам матрицы */
            for (int j = 0; j < matrix.length; j++) {
                /* Генерация случайных чисел и заполнение матрицы */
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    /* Получение всей матрицы */
    public String getMatrix() {
        /* Получение строкового представления многомерного массива */
        String stringMatrix = Arrays.deepToString(matrix);
        /* Преобразование полученного стрового представления в удобочитаемый формат */
        stringMatrix = stringMatrix.replaceAll("\\[\\[", "[").replaceAll("]]", "]")
                .replaceAll("], ", "]\n");
        /* Возвращение строкового представления многомерного массива */
        return stringMatrix;
    }

    /* Получение определенного столбца матрицы */
    public String getColumnMatrix(int column) {
        /* Массив, содержащий значения столбцов */
        int[] columnValues = new int[matrix.length];
        /* Прохождение по строкам матрицы */
        for (int i = 0; i < matrix.length; i++) {
            /* Заполнение массива */
            columnValues[i] = matrix[i][column - 1];
        }
        /* Возвращение строкового представления многомерного массива */
        return Arrays.deepToString(new int[][]{columnValues});
    }

    /* Получение определенной строки матрицы */
    public String getRowMatrix(int row) {
        /* Массив, содержащий значения строк */
        int[] rowValues = new int[matrix.length];
        /* Прохождение по столбцам матрицы */
        for (int j = 0; j < matrix.length; j++) {
            /* Заполнение массива */
            rowValues[j] = matrix[row - 1][j];
        }
        /* Возвращение строкового представления многомерного массива */
        return Arrays.deepToString(new int[][]{rowValues});
    }

    /* Получение главной диагонали матрицы */
    public String getMainDiagonalMatrix() {
        /* Массив, содержащий значения главной диагонали */
        int[] diagonalValues = new int[matrix.length];
        /* Прохождение по строкам матрицы */
        for (int i = 0; i < matrix.length; i++) {
            /* Прохождение по столбцам матрицы */
            for (int j = 0; j < matrix.length; j++) {
                /* Если строка матрицы равна столбцу */
                if (i == j) {
                    /* Заполнение массива */
                    diagonalValues[i] = matrix[i][j];
                }
            }
        }
        /* Возвращение строкового представления многомерного массива */
        return Arrays.deepToString(new int[][]{diagonalValues});
    }

    /* Получение побочной диагонали матрицы */
    public String getSideDiagonalMatrix() {
        /* Массив, содержащий значения главной диагонали */
        int[] diagonalValues = new int[matrix.length];
        /* Прохождение по строкам матрицы */
        for (int i = 0; i < matrix.length; i++) {
            /* Заполнение массива */
            diagonalValues[i] = matrix[i][matrix.length - 1 - i];
        }
        /* Возвращение строкового представления многомерного массива */
        return Arrays.deepToString(new int[][]{diagonalValues});
    }

    /* Получение результата сложения матриц */
    public String getSumMatrix() {
        /* Массив, содержащий результат сложения матриц */
        int[] mathOperationValue = new int[matrix.length];
        /* Прохождение по строкам матрицы */
        for (int i = 0; i < matrix.length; i++) {
            /* Прохождение по столбцам матрицы */
            for (int j = 0; j < matrix.length; j++) {
                /* Заполнение массива */
            }
        }
        /* Возвращение строкового представления многомерного массива */
        return Arrays.deepToString(new int[][]{mathOperationValue});
    }
}
