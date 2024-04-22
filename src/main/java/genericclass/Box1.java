package genericclass;

public class Box1<ElemType> {
    private ElemType element;

    public Box1(ElemType element) {
        this.element = element;
    }

    public ElemType getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Box{" +
                "element=" + element +
                '}';
    }
}
