public class Main {
    public static void main(String[] args) {
        /* Экземляр класса ObjectQueue */
        ObjectQueue objectQueue = new ObjectQueue();

        /* Добавление объектов типа String в очередь */
        for (int i = 0; i < 10; i++) {
            objectQueue.push("String I:" + i);
        }

        /* Получение объектов из очереди до тех пор, пока очередь не закончится */
        while (objectQueue.size() > 0) {
            /* Получение объектов типа String из очереди */
            String string = (String) objectQueue.pull();
            /* Сообщение пользователю */
            System.out.println(string);
            /* Сообщение пользователю */
            System.out.println("Queue size: " + objectQueue.size());
        }
    }
}