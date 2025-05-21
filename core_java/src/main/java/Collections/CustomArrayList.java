package Collections;

public class CustomArrayList<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private final Object[] elements;
    private int size;

    public CustomArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void addElement(T element) { //todo consider increase capacity
        elements[size++] = element;
    }

    public T getElement(int index) {
        validateIndex(index);
        return (T) elements[index];
    }

    public void traverseList() {
        System.out.println("Traversing list...");
        for (int i = 0; i < size; i++) {
            System.out.println("Element: " + elements[i]);
        }
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Please provide correct Index");
        }
    }
}
