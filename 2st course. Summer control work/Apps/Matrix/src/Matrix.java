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

    /* Получение матрицы */
    public String getMatrix() {
        /* Получение строкового представления многомерного массива */
        String stringMatrix = Arrays.deepToString(matrix);
        /* Преобразование полученного стрового представления в удобочитаемый формат */
        stringMatrix = stringMatrix.replaceAll("\\[\\[", "[").replaceAll("]]", "]")
                .replaceAll("], ", "]\n");

        return stringMatrix;
    }

    /* */
}
