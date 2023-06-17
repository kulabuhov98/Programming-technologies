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
        objBox.setObject(obj);
        /* Если очередь пустая - элементы в очереди отсутствуют */
        if (head == null) {
            /* Указание на первым элемент */
            head = objBox;
        } else {
            /*
            * Если элемент не первый, то необходимо, чтобы последний элемент в очереди
            * указывал на только что добавленный элемент
            */
            tail.setNext(objBox);
            /*
             * Если элемент не первый, то необходимо, чтобы последний элемент в очереди
             * указывал на ранее добавленный элемент
             */
            objBox.setPrev(tail);
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
        Object obj = head.getObject();
        /* Перемещение указателя на следующий элемент */
        head = head.getNext();
        /*
        * Если элемент был единстсвенным в очереди, то head = null и tail = null
        */
        if (head == null) {
            tail = null;
        } else {
            head.setPrev(null);
        }
        /* Уменьшением размера очереди */
        size--;

        return obj;
    }

    /* Получить количество объектов в очереди */
    public int size() {
        return size;
    }

    private static class ObjectBox {
        /* Хранилище для данных - добавляемый объект */
        private Object object;
        /* Указатель на следующий элемент */
        private ObjectBox next;
        /* Указатель на предыдущий элемент */
        private ObjectBox prev;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public ObjectBox getNext() {
            return next;
        }

        public void setNext(ObjectBox next) {
            this.next = next;
        }

        public void setPrev(ObjectBox prev) {
            this.prev = prev;
        }
    }
}
