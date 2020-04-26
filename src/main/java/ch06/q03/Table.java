package ch06.q03;

import java.util.ArrayList;

public class Table<K, V> {

    private class Entry<K, V> {

        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private ArrayList<Entry> table = new ArrayList<>();

    public Table() {}

    public V getValue(K key) {
        Entry entry = findEntry(key);
        if (entry == null) return null;
        return (V) entry.value;
    }

    public void putValue(K key, V value) {
        Entry entry = findEntry(key);

        if (entry == null) {
            table.add(new Entry(key, value));
        } else {
            entry.value = value;
        }
    }

    public Entry remove(K key) {
        Entry entry = findEntry(key);

        if (entry == null) return null;

        table.remove(entry);
        return entry;
    }

    private Entry findEntry(K key) {

        for (Entry entry : this.table) {
            if (key == entry.key) {
                return entry;
            }
        }
        return null;
    }

}
