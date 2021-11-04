package com.bz.binarysearch;

public class MyBinaryNode<T extends Comparable<T>> {
    MyBinaryNode<T> left ;
    MyBinaryNode<T> right;
    T key;

    public MyBinaryNode(T key) {
        this.key = key;
    }
}
