package Controllers;

import Models.Matrix;

public class HomeController {
    /* Объект класса модели Matrix */
    private final Matrix matrix;

    /* Конструктор класса контроллера HomeController */
    public HomeController(Matrix matrix) {
        this.matrix = matrix;
    }
}
