import Controllers.HomeController;
import Models.Matrix;
import Views.HomeView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Экземляр класса Scanner */
        Scanner scanner = new Scanner(System.in);
        /* Экземляр класса модели Matrix */
        Matrix matrix = new Matrix();
        /* Экземпляр класса контроллера HomeController */
        HomeController homeController = new HomeController(matrix);
        /* Экземпляр класса представления HomeView */
        HomeView homeView = new HomeView(homeController, scanner);
        /* Инициализация приложения */
        homeView.main();
    }
}