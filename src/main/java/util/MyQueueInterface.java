package util;

public interface MyQueueInterface<AnyType> {

    /**
     * Add element to queue
     * @param element
     */
    void enqueue(AnyType element);

    /**
     * remove first added element, from queue
     * @return
     */
    AnyType dequeue();

    /**
     * remove first added element, from queue
     * @return
     */
    AnyType first();

    /**
     * Return size of queue
     * @return
     */
    int size();

    /**
     * Return the value true if queue is empty, else return false
     * @return
     */
    boolean isEmpty();

    /**
     * Return index number of element
     * @param element
     * @return
     */
    int indexOf(AnyType element);

    /**
     * Return the value true if element exist in queue, else return false
     * @param element
     * @return
     */
    boolean contains(AnyType element);

}
