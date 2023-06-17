public class Main {
    public static void main(String[] args) {
        /* Экземляр класса ObjectQueue */
        ObjectQueue objectQueue = new ObjectQueue();

        /* Добавление объектов типа String в очередь */
        for(int i = 0; i < 10; i++) {
            queue.push("String:" + i);
        }

        /* Получение объектов из очереди до тех пор, пока очередь не закончится */
        while (queue.size() > 0) {
            /* Получение объектов типа String из очереди */
            String string = (String) queue.pull();
            /* Сообщение пользователю */
            System.out.println(string);
            /* Сообщение пользователю */
            System.out.println("Queue size: " + queue.size());
        }
    }
}