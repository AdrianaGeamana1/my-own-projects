package genericmethods;


import genericclass.Box1;

public class Util {
//    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
//        return p1.getKey().equals(p2.getKey()) &&
//                p1.getValue().equals(p2.getValue());
//    }

    public static <K> boolean compare(Box1<K> b1, Box1<K> b2) {
        return b1.getElement().equals(b2.getElement());
    }
}
