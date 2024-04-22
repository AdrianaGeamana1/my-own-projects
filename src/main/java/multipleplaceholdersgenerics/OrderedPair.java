package multipleplaceholdersgenerics;

public class OrderedPair<K, V> implements Pair<K, V> {
    K key;
    V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "OrderedPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
