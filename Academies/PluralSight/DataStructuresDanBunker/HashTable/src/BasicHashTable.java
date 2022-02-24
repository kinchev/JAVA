public class BasicHashTable<K, V> {
    private HashEntry[] data;
    private int capacity;
    private int size;

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        this.data=new HashEntry[this.capacity];
        this.size=0;
    }
    public int size(){
        return this.size;
    }
    public V get(K key){
        int hash=calculateHash(key);
        if(data[hash]==null){
            return null;
        }
        else{
            return (V)data[hash].getValue();
        }

    }
    public void put(K key, V value){
        int hash=calculateHash(key);
        data[hash]=new HashEntry<K, V>(key,value);
        size++;
    }
    private int calculateHash(K key){
        int hash=(key.hashCode()%this.capacity);
        while(data[hash]!=null && !data[hash].getKey().equals(key)){
            hash=(hash+1)%this.capacity;
        }
        return hash;
    }

    private static class HashEntry<X,Y>{
        private X key;
        private Y value;

        public HashEntry(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }
}
