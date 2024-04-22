package genericclass;

import java.util.List;

public class MainBag {
    public static void main(String[] args) {
        Bag<Integer> integerBag = new Bag<>(List.of(1, 2, 3, 4, 5, 6, 7));
//        integerBag.printElements();
        Bag<String> stringBag = new Bag<>(List.of("st1", "st2", "s3"));
//        stringBag.printElements();

        for (String elem: stringBag.getElements()){
            System.out.println(elem);
        }
    }
}
