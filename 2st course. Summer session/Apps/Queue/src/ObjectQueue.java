public class ObjectQueue {
    /* Указатель на первый элемент */
    private ObjectBox head = null;
    /* Указатель на последний элемент */
    private ObjectBox tail = null;
    /* Размер очереди */
    private int size = 0;

    /* Положить объект (произвольного класса) в очередь */
    public void push(Object obj) {
        /* Создание вспомогательного объекта и помещение в него нового элемента */
        ObjectBox objBox = new ObjectBox();
        objBox.object = obj;
        /* Если очередь пустая - элементы в очереди отсутствуют */
        if (head == null) {
            /* Указание на первым элемент */
            head = objBox;
        } else {
            /*
            * Если элемент не первый, то необходимо, чтобы последний элемент в очереди
            * указывал на только что добавленный элемент
            */
            tail.next = objBox;
            /*
             * Если элемент не первый, то необходимо, чтобы последний элемент в очереди
             * указывал на ранее добавленный элемент
             */
            objBox.prev = tail;
        }
        /*
        * Если элемент первый, то оба указателя должны
        * ссылаться на один и тот же элемент
        */
        tail = objBox;
        /* Увеличение размера очереди */
        size++;
    }

    /* Вытащить объект (произвольного класса) из очереди */
    public Object pull() {
        /* Если в очереди нет элементов */
        if (size == 0) {
            return null;
        }
        /* Получение объекта, ссылающегося на первый элемент из вспомогательного класса */
        Object obj = head.object;
        /* Перемещение указателя на следующий элемент */
        head = head.next;
        /*
        * Если элемент был единстсвенным в очереди, то head = null и tail = null
        */
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        /* Уменьшением размера очереди */
        size--;

        return obj;
    }

    /* Получить количество объектов в очереди */
    public int size() {
        return size;
    }

    public Object get(int index) {
        /* Если нет элементов или индекс больше размера или индекс меньше 0 */
        if(size == 0 || index >= size || index < 0) {
            return null;
        }
        // Устанавлваем указатель, который будем перемещать на "голову"
        ObjectBox current = head;
        // В этом случае позиция равну 0
        int pos = 0;
        // Пока позиция не достигла нужного индекса
        while(pos < index) {
            // Перемещаемся на следующий элемент
            current = current.getNext();
            // И увеличиваем позицию
            pos++;
        }
        // Мы дошли до нужной позиции и теперь можем вернуть элемент
        Object obj = current.getObject();
        return obj;
    }

    private static class ObjectBox {
        /* Хранилище для данных - добавляемый объект */
        private Object object;
        /* Указатель на следующий элемент */
        private ObjectBox next;
        /* Указатель на предыдущий элемент */
        private ObjectBox prev;
    }
}
