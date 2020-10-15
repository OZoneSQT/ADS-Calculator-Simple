package util;

public interface MyQueueInterface<AnyType> {
    void enqueue(AnyType element);
    AnyType dequeue();
    AnyType first();
    int size();
    boolean isEmpty();
    int indexOf(AnyType element);
    boolean contains(AnyType element);

}
