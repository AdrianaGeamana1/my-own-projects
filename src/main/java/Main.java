import genericclass.Box1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.add("String 1");
//        strings.add(Integer.valueOf(1));

        String str = strings.get(0);

//        integers.add("String 1");
        integers.add(Integer.valueOf(1));

        List genericList = new ArrayList();
        genericList.add("String 1");
        genericList.add(Integer.valueOf(1));
        //String s1 = (String) genericList.get(1);

        Car car = new Dacia();
//        List<Car> cars = new ArrayList<Dacia>();
        List<Dacia> cars2 = new ArrayList<Dacia>();

//        List<Number> numbers = new ArrayList<Integer>();
        List<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.add(1);
        numbers2.add(1);
        numbers2.add(1);

        List<Dacia> daciaList = new ArrayList<>();
        daciaList.add(new Dacia());
        daciaList.add(new Dacia());
        daciaList.add(new Dacia());
//        printCars(daciaList);


        List<Mercedes> mercedes = new ArrayList<>();
        mercedes.add(new Mercedes());
        mercedes.add(new Mercedes());
//        printCars2(mercedes);
//        printCars2(daciaList);
//        printCars2(numbers2);

//        printCars3(daciaList);
//        printCars3(numbers2);

        Box1<Integer> integerBox = new Box1<>(12); // echivalent cu  new Fo<>(Integer.valueOf(12))
        System.out.println(integerBox);
        Box1<String> stringBox = new Box1<>("A string in foo"); // echivalent cu  new Fo<>(Integer.valueOf(12))
        System.out.println(integerBox);

//        Box<int> intBox = new Box<>(1);
        Box1<Box1<Box1<Box1<String>>>> multiBox = new Box1<>(new Box1<>(new Box1<>(new Box1<>("Surprise!!"))));
        System.out.println(multiBox);
    }

    public static void printCars(List<Dacia> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void printCars2(List<?> cars) {
        for (Object car : cars) {
            System.out.println(car);
        }
    }

    public static void printCars3(List<? extends Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
