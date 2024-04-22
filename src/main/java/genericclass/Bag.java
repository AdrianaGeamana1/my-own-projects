package genericclass;

import java.util.List;

public class Bag<T> {
    private List<T> elements;

    public Bag(List<T> elements) {
        this.elements = elements;
    }

    public void printElements() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public List<T> getElements() {
        return elements;
    }
}
