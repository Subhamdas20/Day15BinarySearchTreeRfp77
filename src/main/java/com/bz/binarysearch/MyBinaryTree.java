package com.bz.binarysearch;

public class MyBinaryTree <T extends Comparable<T>> {

    private MyBinaryNode<T> root;

    public void add(T key) {
        this.root =this.addRecursively(root , key);
    }
    public MyBinaryNode<T> addRecursively(MyBinaryNode<T> current , T key){
        if(current==null){
            return new MyBinaryNode<>(key);
        }
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0) return current;
        if (compareResult <0){
            current.left = addRecursively(current.left , key);
        }
        else
            current.right = addRecursively(current.right , key);
        return current;
    }
}
