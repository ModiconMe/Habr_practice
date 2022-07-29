package recursive;

import java.util.Arrays;
import java.util.Objects;

public class HashTree <K extends Comparable<K>, V>{

    private Node root;
//    private Node[] nodes;

    public HashTree() {
    }

    public Node get(K key){
        Node x = this.root;
        while (this.root != null){
            int cmp = x.key.compareTo(key);
            if (cmp == 0){
                return x;
            } else if (cmp > 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        return null;
    }

    public void add(K key, V value){
        Node<K,V> x = root, y = null;
        while (x != null){
            int cmp = x.key.compareTo(key);
            if (cmp == 0){
                x.value = value;
                return;
            }
            y = x;
            if (cmp > 0) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        Node<K,V> node = new Node<>(key,value);
        if (y == null){
            root = node;
        } else {
            if (y.key.compareTo(node.key) > 0){
                y.left = node;
            } else {
                y.right = node;
            }
        }
    }

//    public void remove(K key){
//        Node<K, V> x = root, y = null;
//        while (x != null) {
//            int cmp = key.compareTo(x.key);
//            if (cmp == 0) {
//                break;
//            } else {
//                y = x;
//                if (cmp < 0) {
//                    x = x.left;
//                } else {
//                    x = x.right;
//                }
//            }
//        }
//        if (x == null) {
//            return;
//        }
//        if (x.right == null) {
//            if (y == null) {
//                root = x.left;
//            } else {
//                if (x == y.left) {
//                    y.left = x.left;
//                } else {
//                    y.right = x.left;
//                }
//            }
//        } else {
//            Node<K, V> leftMost = x.right;
//            y = null;
//            while (leftMost.left != null) {
//                y = leftMost;
//                leftMost = leftMost.left;
//            }
//            if (y != null) {
//                y.left = leftMost.right;
//            } else {
//                x.right = leftMost.right;
//            }
//            x.key = leftMost.key;
//            x.value = leftMost.value;
//        }
//    }
    public void remove(K key){
        Node<K,V> x = root, y = null;
        while (x != null){
            int cmp = x.key.compareTo(key);
            if (cmp == 0){
                break;
            }
            y = x;
            if (cmp > 0) {
                x = x.left;
            } else {
                x = x.right;
            }

            if (x == null){
                return;
            }
            y = null;

            if (x.left == null){
                y = x.right.left;
                x.key = y.key;
            } else {
                y = x.left.right;
                x.key = y.key;
            }
        }
    }
    public static class Node<K extends Comparable<K>, V>{

        private K key;
        private V value;
        private Node left;
        private Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}


