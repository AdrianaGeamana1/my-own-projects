package genericmethods;

import genericclass.Box1;

public class MainGenericMethods {

    public static void main(String[] args) {
        Box1<String> box1 = new Box1<>("St1");
        Box1<String> box2 = new Box1<>("St2");

        System.out.println(Util.compare(box1, box2));
        System.out.println(Util.compare(box1, box1));

        Box1<Integer> integerBox1 = new Box1<>(1);
        Box1<Integer> integerBox2 = new Box1<>(2);

        System.out.println(Util.compare(integerBox1, integerBox2));
        System.out.println(Util.compare(integerBox1, integerBox1));
    }
}
