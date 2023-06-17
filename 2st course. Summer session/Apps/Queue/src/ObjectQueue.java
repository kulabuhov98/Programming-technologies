public class ObjectQueue {
    /* Указатель на первый элемент */
    private ObjectBox head = null;
    /* Указатель на последний элемент */
    private ObjectBox tail = null;
    /* Размер очереди */
    private int size = 0;

    /* Положить объект (произвольного класса) в очередь */
    public void push(Object obj) {
    }

    /* Вытащить объект (произвольного класса) из очереди */
    public Object pull() {
    }

    /* Получить количество объектов в очереди */
    public int size() {
    }

    private class ObjectBox {
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

        public ObjectBox getPrev() {
            return prev;
        }

        public void setPrev(ObjectBox prev) {
            this.prev = prev;
        }
    }
}
