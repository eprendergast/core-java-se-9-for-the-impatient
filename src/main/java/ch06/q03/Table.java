package ch06.q03;

import java.util.ArrayList;
import java.util.List;

public class Table<K, V> {

    private class Entry<K, V> {

        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<Entry> table = new ArrayList<>();

    public V get(K key) {
        Entry entry = findEntry(key);
        if (entry == null) return null;
        return (V) entry.value;
    }

    public void put(K key, V value) {
        Entry entry = findEntry(key);

        if (entry == null) {
            table.add(new Entry(key, value));
        } else {
            entry.value = value;
        }
    }

    public V remove(K key) {
        Entry entry = findEntry(key);
        if (entry == null) return null;

        table.remove(entry);
        return (V) entry.value;
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
