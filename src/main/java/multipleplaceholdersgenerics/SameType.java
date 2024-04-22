package multipleplaceholdersgenerics;

public class SameType <K> extends OrderedPair<K, K>{
    public SameType(K key, K value) {
        super(key, value);
    }
}
