package tamrin2;

public class MyTuple<K, V> {

    private K first;
    private V second;

    public MyTuple(K first, V second){
        this.first = first;
        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
    public String toString() {
        return first.toString() + " -- " + second.toString();
    }
}