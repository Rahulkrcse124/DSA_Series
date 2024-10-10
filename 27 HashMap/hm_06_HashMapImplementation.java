// import java.util.LinkedList;

// public class hm_06_HashMapImplementation {

// static class MyHashMap<K, V> {
// public static final int DEFAULT_CAPACITY = 4;
// public static final float DEFAULT_LOAD_FACTOR = .75f;

// private class Node {
// K key;
// V value;

// Node(K key, V value) {
// this.key = key;
// this.value = value;
// }
// }

// private int n; // number of key-value pairs
// private LinkedList<Node>[] buckets; // array of linked lists (chains)

// // Constructor to initialize the HashMap
// public MyHashMap() {
// this.buckets = new LinkedList[DEFAULT_CAPACITY];
// for (int i = 0; i < DEFAULT_CAPACITY; i++) {
// this.buckets[i] = new LinkedList<>();
// }
// this.n = 0;
// }

// // Method to calculate the index for a given key based on the hashcode
// private int hash(K key) {
// int hashCode = key.hashCode();
// return Math.abs(hashCode) % buckets.length;
// }

// // Method to get the current size of the HashMap (number of key-value pairs)
// public int size() {
// return n;
// }

// // Method to put a key-value pair in the HashMap
// public void put(K key, V value) {
// int bucketIndex = hash(key);
// LinkedList<Node> chain = buckets[bucketIndex];

// for (Node node : chain) {
// if (node.key.equals(key)) {
// node.value = value; // update existing key with new value
// return;
// }
// }

// // If key is not found, add new node
// chain.add(new Node(key, value));
// n++;

// // Check if rehashing is needed
// if ((float) n / buckets.length >= DEFAULT_LOAD_FACTOR) {
// rehash();
// }
// }

// // Method to get the value associated with a key
// public V get(K key) {
// int bucketIndex = hash(key);
// LinkedList<Node> chain = buckets[bucketIndex];

// for (Node node : chain) {
// if (node.key.equals(key)) {
// return node.value;
// }
// }

// // If key is not found, return null
// return null;
// }

// // Method to remove a key-value pair from the HashMap
// public V remove(K key) {
// int bucketIndex = hash(key);
// LinkedList<Node> chain = buckets[bucketIndex];

// for (int i = 0; i < chain.size(); i++) {
// Node node = chain.get(i);
// if (node.key.equals(key)) {
// V oldValue = node.value;
// chain.remove(i); // remove the node from the chain
// n--;
// return oldValue;
// }
// }

// // If key is not found, return null
// return null;
// }

// // Rehashing method to increase the bucket array size when load factor
// exceeds
// // threshold
// private void rehash() {
// LinkedList<Node>[] oldBuckets = buckets;
// buckets = new LinkedList[oldBuckets.length * 2];

// for (int i = 0; i < buckets.length; i++) {
// buckets[i] = new LinkedList<>();
// }

// n = 0; // reset size

// for (LinkedList<Node> chain : oldBuckets) {
// for (Node node : chain) {
// put(node.key, node.value); // reinsert all key-value pairs
// }
// }
// }
// }

// public static void main(String args[]) {
// MyHashMap<String, Integer> mp = new MyHashMap<>();

// // Testing the methods
// mp.put("One", 1);
// mp.put("Two", 2);
// mp.put("Three", 3);

// System.out.println("Size: " + mp.size()); // Output: Size: 3
// System.out.println("Get 'Two': " + mp.get("Two")); // Output: Get 'Two': 2

// mp.put("Two", 22); // Update value for key "Two"
// System.out.println("Updated 'Two': " + mp.get("Two")); // Output: Updated
// 'Two': 22

// System.out.println("Remove 'One': " + mp.remove("One")); // Output: Remove
// 'One': 1
// System.out.println("Get 'One': " + mp.get("One")); // Output: Get 'One': null
// System.out.println("Size after removal: " + mp.size()); // Output: Size after
// removal: 2
// }
// }
