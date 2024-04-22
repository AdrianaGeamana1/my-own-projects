package wildcard;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2 ,3 ,4 , 5);
        List<Double> doubles = List.of(1.0, 2.2 ,3.0 ,4.0 , 5.0);
        List<String> strings = List.of("st1");

        System.out.println(calculateSum(integers));
        System.out.println(calculateSum(doubles));
//        System.out.println(calculateSum(strings));


        System.out.println(calculateSum2(integers));
        System.out.println(calculateSum2(doubles));
//        System.out.println(calculateSum2(strings));
    }

    private static double calculateSum(List<?> numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
                sum = sum + ((Number)numbers.get(i)).doubleValue();
        }
        return sum;
    }

    private static double calculateSum2(List<? extends Number> numbers) {
        double sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i).doubleValue();
        }
        return sum;
    }
}
