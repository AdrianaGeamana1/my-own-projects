package multipleplaceholdersgenerics;

public class MainMultiplePlaceHolders {
    public static void main(String[] args) {
        Pair<String, String> stringPair = new OrderedPair<>("StringKey", "StringValue");
        Pair<Integer, Double> pair1 = new OrderedPair<>(1, 1.0);

        System.out.println(stringPair);
        System.out.println(pair1);

        FloatPair pair2 = new FloatPair(1.0f, 2.0f);
        System.out.println(pair2);
//        Pair pair3 = new FloatPair(1.23f, 2.445f);
        Pair<Float, Float> pair3 = new FloatPair(1.23f, 2.445f);
        System.out.println(pair3);

        Pair<Double, Double> doublePair = new SameType<>(1.2343, 1.2343);
        SameType<Double> doublePai2 = new SameType<>(1.2343, 1.2343);
        System.out.println(doublePair);
        System.out.println(doublePai2);
    }
}
