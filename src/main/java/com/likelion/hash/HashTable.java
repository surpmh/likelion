package com.likelion.hash;

public class HashTable {

    private int size = 10000;
    private int[] table = new int[size];

    public HashTable() {
    }

    public HashTable(int size) {
        this.size = size;
        this.table = new int[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashCod = hash(key);
        this.table[hashCod] = value;
        System.out.println(hashCod + "번 방에 지정되었습니다.");
    }

    public int search(String key) {
        return this.table[hash(key)];
    }

    public static void main(String[] args) {
        String[] names = new String[]{"AyeongChoi"};
        HashTable ht = new HashTable(200);
        for (int i = 0; i < names.length; i++) {
            ht.insert(names[i], ht.hash(names[i]));
        }
        ht.search("AyeongChoi");
    }
}
