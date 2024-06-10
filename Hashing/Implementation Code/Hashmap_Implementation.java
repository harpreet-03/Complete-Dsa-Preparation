// Hashmap Implementation:

// Array of LinkedList
// Time Complexity: O(1) on average (if the elements are uniformly distributed)
// Space Complexity: O(n) where n is the number of elements in the hashmap

// why hashmaps operation are done in constant time complexity ? 
// 1. Hashmaps are implemented using arrays of linked lists.
// 2. The hashcode of the key is calculated and then the index is calculated using the hashcode.
// 3. The element is stored in the linked list at that index.

import java.util.*;

public class Hashmap_Implementation {
    static class HashMap<K, V> { // generic
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private int N; // size of the bucket array
        private LinkedList<Node>[] buckets; // array of linked lists

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4; 
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // HashFunction :
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // SearchInLL :
        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (Node node : ll) {
                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        // Re-hash():
        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBuckets = this.buckets;
            this.buckets = new LinkedList[N * 2];
            N = 2 * this.N;

            for (int i = 0; i < this.buckets.length; i++) {
                this.buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> oldBucket : oldBuckets) {
                for (Node node : oldBucket) {
                    put(node.key, node.value);
                }
            }
        }

        // put(): O(lambda) --> O(1)
        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di == -1) {
                this.buckets[bi].add(new Node(key, value));
                this.n++;
            } else {
                this.buckets[bi].get(di).value = value;
            }

            // Re-hashing:
            double lambda = (double) this.n / this.N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // containsKey(): O(1)
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            return di != -1;
        }

        // get(): O(1)
        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                return this.buckets[bi].get(di).value;
            }
        }

        // remove(): O(1)
        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                this.n--;
                return this.buckets[bi].remove(di).value;
            }
        }

        // keySet():
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < this.N; i++) {
                for (Node node : this.buckets[i]) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // isEmpty():
        public boolean isEmpty() {
            return this.n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 200);
        hm.put("UK", 300);
        hm.put("Russia", 400);

        ArrayList<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println(k + " -> " + hm.get(k));
        }
    }
}
