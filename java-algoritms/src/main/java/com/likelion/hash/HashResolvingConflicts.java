package com.likelion.hash;


import java.util.ArrayList;
import java.util.List;

public class HashResolvingConflicts {

    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private List<Node>[] table = new ArrayList[1000];

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 1000;
    }

    public void insert(String key, Integer value) {
        int hashIdx = hash(key);
        if (this.table[hashIdx] == null) {
            this.table[hashIdx] = new ArrayList<>();
        }
        this.table[hashIdx].add(new Node(key, value));

        System.out.println(hashIdx + "번 방에 지정되었습니다.");
    }

    public Integer get(String key) {
        List<Node> nodes = this.table[hash(key)];
        for (Node node : nodes) {
            if(key.equals(node.getKey())) {
                return node.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] names = new String[]{"DongyeonKang", "SubinKang", "KwanwunKo", "HyunseokKo", "KyoungdukKoo", "YeonjiGu", "SoyeonKown", "OhsukKwon", "GunwooKim", "KiheonKim", "NayeongKim", "DohyeonKim", "MinkyoungKim", "MinjiKim", "SanghoKim", "SolbaeKim", "YejinKim", "EungjunKim", "JaegeunKim", "JeonghyeonKim", "JunhoKim", "JisuKim", "kimjinah", "HaneulKim", "HeejungKim", "KimoonPark", "EunbinPark", "JeongHoonPark", "JeminPark", "TaegeunPark", "JiwonBae", "SeunggeunBaek", "JihwanByeon", "HeungseopByeon", "JeongHeeSeo", "TaegeonSeo", "SeeYunSeok", "SuyeonSeong", "SeyoelSon", "MinjiSong", "JinwooSong", "hyunboSim", "SominAhn", "JiyoungAhn", "ChangbumAn", "SoonminEom",
                "HyeongsangOh", "SuinWoo", "JuwanWoo", "InkyuYoon", "GahyunLee", "DaonLee", "DohyunLee", "SanghunLee", "SujinLee", "AjinLee", "YeonJae", "HyeonjuLee", "HakjunYim", "SeoyunJang", "SeohyeonJang", "JinseonJang", "SujinJeon", "SeunghwanJeon", "DaehwanJung", "JaeHyunJeung", "HeejunJeong", "GukhyeonCho", "MunjuJo", "YejiJo", "ChanminJu", "MinjunChoi", "SujeongChoi", "SeunghoChoi", "AyeongChoi", "GeonjooHan", "JinhyuckHeo", "MinwooHwang", "SieunHwang", "JunhaHwang"};
        HashResolvingConflicts hrc = new HashResolvingConflicts();
        for (int i = 0; i < names.length; i++) {
            hrc.insert(names[i], hrc.hash(names[i]));
        }
        System.out.println(hrc.get("AyeongChoi"));
    }
}